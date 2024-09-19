
import java.util.Scanner;

class Type {
    String shape(String s) {
        return s;
    }
}

public class Projj extends Type {
    String colour;
     String shape(String s) {
        return s;
    }

    public Projj(String col) {
        this.colour = col;
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
        System.out.println("Type of vehicle: " + shape(j));
        System.out.println("Number: " + numberPlate(p));
        System.out.println("Colour: " + colour(c));
        //System.out.println("Price: " + price(num));
    }


    void displayInfo(String j, String p, String c, double num) {
        System.out.println("Type of vehicle: " + shape(j));
        System.out.println("Number: " + numberPlate(p));
        System.out.println("Colour: " + colour(c));
        System.out.println("Price: " + price(num));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m = 0;
        String p="", c = "", j = "";
        double num = 0.0;
        Projj obj = new Projj("");

        while (true) {
            System.out.println("Which type of vehicle you have?\n1.Car\n2.Truck\n3.Bus\n4.Bike\n5.Display\n6.Exit");
            n = scanner.nextInt();

            if (n == 1 || n == 2 || n == 3 || n==4) {
                System.out.print("How many vehicles do you have: ");
                m = scanner.nextInt();
            } else if (n == 5) {
                for (int i = 0; i < m; i++) {
                    obj.displayInfo(j, p, c, num);
                }
            } else if (n == 6) {
                System.out.println("Exiting the program.");
                break;
            }

            for (int i = 0; i < m; i++) {
                Scanner input = new Scanner(System.in);
                System.out.print("Which shape of your vehicle: ");
                j = input.nextLine();
                System.out.print("Number plate: ");
                p = input.nextLine();
                System.out.print("Enter the colour of your vehicle: ");
                c = input.nextLine();
                System.out.print("Enter the price: ");
                num = input.nextDouble();
                System.out.println();
            }
        }
    }
}

