interface Drawable{  //define interface
   public void draw();
   public void coloring();
}
 class circle implements Drawable {   //using implements by calling interface
    public double radious;
    circle(double radious){    //constructor
        this.radious=radious;
    }
    public void draw(){      // methods
        System.out.println("Circle is drawn with :"+radious);
    }
   public void coloring(){
    System.out.println("Enter the colour");
    }
}
 class Rectangle implements Drawable{   //using implements by calling interface
    public int length;
    public int width;
    Rectangle(int length,int width){   //constructor
        this.length=length;
        this.width=width;
    } 
    public void draw(){      // methods
        System.out.println("Rectangle is draw with :"+length+"  Width : "+width);
    }
   public void coloring(){
    System.out.println("Enter the colour");
    }
}
class triangular implements Drawable{    //using implements by calling interface
    double arm;
    String color = "red";
    triangular(double a){    //constructor
        arm = a;
    }
   public void draw(){      // methods
  System.out.println("triangle complted with arm"+arm);

    }
   public void coloring(){
    System.out.println("The color of triangle is :"+color);
    }
}

public class inter{
    public static void main(String[] args) {
        circle cir = new circle(5.0);   //object creation
        Rectangle rec = new Rectangle(4,6 );
        triangular tri = new triangular(7.0);
        cir.draw();  //calling methods
        rec.draw();
        tri.coloring();

    }
}