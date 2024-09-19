  import java.util.Scanner;

 class Vehicle{
        protected String color;
        protected String number_plate;
        protected double price;
    public Vehicle(){
        //String color;
        //String number_plate;
        //double price;

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
    public class s{
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
}
