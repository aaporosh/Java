import java.util.Scanner;

class VehicleType {
    String shape(String s) {
        return s;
    }
}

class Vehicle {
    String number_plate(String p) {
        return p;
    }

    String colour(String col) {
        return col;
    }

    double price(double n) {
        return n;
    }

    void displayDetails(String j, String p, String c, double num) {
        System.out.println("Type of vehicle: " + shape(j));
        System.out.println("Number: " + number_plate(p));
        System.out.println("Colour: " + colour(c));
        System.out.println("Price: " + price(num));
    }
}

public class VehicleInfoApp {
    public static void main(String[] args) {
        String p, c, j;
        double num;
        
        VehicleType typeObj = new VehicleType();
        Vehicle vehicleObj = new Vehicle();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Which shape of your vehicle: ");
        j = sc.nextLine();
        
        System.out.print("Number plate: ");
        p = sc.nextLine();
        
        System.out.print("Enter the colour of your vehicle: ");
        c = sc.nextLine();
        
        System.out.print("Enter the price: ");
        num = sc.nextDouble();
        
        vehicleObj.displayDetails(j, p, c, num);
    }
}
