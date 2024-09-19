 /* import java.util.Scanner;

 class Vehicle{
        protected String color;
        protected String number_plate;
        protected double price;
    public Vehicle(){
        String color;
        String number_plate;
        double price;

    }
    public Vehicle(String color,String number_plate){
        this.color=color;
        this.number_plate=number_plate;

    }
    public Vehicle(String color,String number_plate,double price){
        this.color=color;
        this.number_plate=number_plate;
        this.price=price;
    }
    public String toString(){
        return "Color: " +color+ "Number_plate: " +number_plate+ " Price: $" +price;
    }
    public void Attributes(String color,String number_plate,double price){
        this.color=color;
        this.number_plate=number_plate;
        this.price=price;
    }
 }
    class Car extends Vehicle{
        private String shape;
        public Car(String color,String number_plate,String shape,double price){
            super(color,number_plate,price);
            this.shape=shape;
        }
        public String toString(){
        return "Shape: " +shape+ " " +super.toString();
        }

    }
    public class Main{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter vehicle color: ");
    String color = sc.nextLine();
    System.out.print("Enter vehicle Shape: ");
    String shape = sc.nextLine();
    System.out.print("Enter vehicle number plate: ");
    String number_plate = sc.nextLine();
    System.out.print("Enter vehicle price: ");
    double price = sc.nextDouble();

    Car car=new Car(color,shape,number_plate,price);
    

    System.out.println("Car details: ");
    System.out.println(car);
    sc.close();


    }
}*/
import java.util.Scanner;
class type{
    String shape(String s){
        return s;
    }
}
public class vehicle extends type {
    String colour;
    public vehicle(String col){
        this.colour=col;

    }
    String colour(String col){
        return col;
    }
    double price(double n){
        return n;
    }
    String number_plate(String p){
        return p;
    }
    void displayDetails(String j, String p, String c, double num) {
        System.out.println("Type of vehicle: " + shape(j));
        System.out.println("Number: " + number_plate(p));
        System.out.println("Colour: " + colour(c));
        System.out.println("Price: " + price(num));
    }
    public static void main(String[] args) {
        String p,c,j;
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Which shape of your vehicle : ");
        j=sc.nextLine();
        System.out.print("Number plate :");
        p=sc.nextLine();
        System.out.print("enter the colour of your vehicle : ");
        c = sc.nextLine();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price : ");
         num = input.nextDouble();
         vehicle obj = new vehicle(c);
        type ob = new type();
        System.out.println();
        obj.displayDetails(j,p,c,num);
       // }
    }
}