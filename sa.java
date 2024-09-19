interface shape{
    double calculatearea();
}
class circle implements shape{ // for interface use it
    double radious;
    public circle(double radious){
        this.radious=radious; // over ridding
    }
    public double calculatearea(){
        return 3.1416*radious*radious;
    }
}
class rectengular implements shape{
    double length;
    double width;
    public rectengular(double length, double width){
        this.length=length;  //over ridding
        this.width=width;    // use this keyword
    }
    public double calculatearea(){
        return 0.5*length*width;
    }
    
}
public class sa {
    public static void main(String[] args) {
        circle cir = new circle(6.0); //assosiation
        rectengular rec = new rectengular(8, 6);
        System.out.println("Area of circle is :"+cir.calculatearea());
        System.out.println("Area of rectengular is :"+rec.calculatearea());
    }
}

