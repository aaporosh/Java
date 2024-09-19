
abstract class shape { //use abstract class

    public abstract double area();
    public abstract double perimeter();
}

class circle extends shape  {

    private double r ;
    circle(double r){  //constructor
        this.r=r;
    }
    public double area(){
        return 3.1416*r*r;
    }
    public double perimeter(){
        return 2*3.1416*r;
    }
    
}
class rectangle extends shape  {

    private double h,l ;
    rectangle(double h,double l){  //constractor
        this.h=h;
        this.l=l;
    }
    public double area(){
        return h*l;
    }
    public double perimeter(){
        return 2*(h+l);
    }
    
}
public class lab_r {
    public static void main(String[] args) {
        circle c= new circle(7);    //create object for circle
        System.out.println("Area of Circle :"+c.area());
        System.out.println("Perimeter of Circle :"+c.perimeter());
        rectangle re =new rectangle(6, 8); //create object for rectangle
        System.out.println("Area of Rectangle :"+re.area());
        System.out.println("Perimeter of Rectangle : "+re.perimeter());
    }
}
