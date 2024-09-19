
import java.util.Scanner;

class Type {
    String shape(String s) {
        return s;
    }
}

public class vehicle extends Type { //Inheritance
    String colour;
     String shape(String s) { //Overridinng
        return s;
    }

    String vehicle(String col) {
        this.colour = col; //This keyword
        return col;
    }

    String colour(String col) {
        return col;
    }

    double price(double n) {
        return n;
    }

    String numberPlate(String p) {
        return p;
    }
     void displayInfo(String j, String p, String c ) {
        System.out.println("Licence number: " + shape(j));
        System.out.println("Number: " + numberPlate(p));
        System.out.println("Colour: " + colour(c));
    }

    //Overloadinng
    void displayInfo(String j, String p, String c, double num) { 
        System.out.println("Licence number: " + shape(j));
        System.out.println("Number: " + numberPlate(p));
        System.out.println("Colour: " + colour(c));
        System.out.println("Price: " + price(num));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m = 0;
        String p="", c = "", j = "";
        double num = 0.0;
        vehicle obj = new vehicle();
        System.out.println("****** Welcome to our VEHICLE management system ******");
        System.out.println();
        while (true) {
            System.out.println("Which type of vehicle you have?\n1.Car\n2.Truck\n3.Bus\n4.Bike\n5.Display\n6.Exit");
            n = scanner.nextInt();

            if (n == 1 || n == 2 || n == 3 || n==4) {
                System.out.print("How many vehicles do you have: ");
                m = scanner.nextInt();
                System.out.println();
                for (int i = 0; i < m; i++) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the Licence number :");
                j = input.nextLine();
                System.out.print("Number plate: ");
                p = input.nextLine();
                System.out.print("Enter the colour of your vehicle: ");
                c = input.nextLine();
                System.out.print("Enter the price: ");
                num = input.nextDouble();
                System.out.println();
            }
            } else if (n == 5) {
                for (int i = 0; i < m; i++) {
                    obj.displayInfo(j, p, c, num);
                }
            } else if (n == 6) {
                System.out.println("Exiting the program.");
                break;
            }
        }
    }
}

