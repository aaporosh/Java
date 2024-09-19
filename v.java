    import java.util.Scanner;

//class print{
    
//}
class type{
    String shape(String s){
        return s;
    }
}
//class bike{

//}
public class vehicle extends type {
    String colour(String col){
        return col;
    }
    double price(double n){
        return n;
    }
    String number_plate(String p){
        return p;
    }
    public static void main(String[] args) {
        String p,c,j;
        double num;
        vehicle obj = new vehicle();
        type ob = new type();
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
        System.out.println("Type of vehicle : "+ob.shape(j));
        System.out.println("Number : "+obj.number_plate(p));
        System.out.println("Colour : "+obj.colour(c));
        System.out.println("Price :"+obj.price(num));
       // }
    }
}

