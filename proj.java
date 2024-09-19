import java.util.Scanner;
class type{
    String shape(String s){
        return s;
    }
}
public class proj extends  type{
    String colour;
    public proj(String col){
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
    void proj(String j, String p, String c, double num) {
        System.out.println("Type of vehicle: " + shape(j));
        System.out.println("Number: " + number_plate(p));
        System.out.println("Colour: " + colour(c));
        System.out.println("Price: " + price(num));
    }
    public static void main(String[] args) {
        String color;
        String number_plate;
        double price;
        int n,m;
        String p,c,j;
        double num;
        while(true){
        System.out.println("Which type of vehicle you have?\n1.Car\n2.Track\n3.Bus\n4.Bike\n5.display");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        proj obj =new proj();
        if(n==1){
            System.out.println("How many car you have : ");
            m=s.nextInt();
            int[] arr = new int[m];
            for(int i =0;i<m;i++){
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
        System.out.println();
            }
        }
        else if(n==2){
            System.out.println("How many track you have : ");
            m=s.nextInt();
            int[] arr = new int[m];
            for(int i =0;i<m;i++){
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
        System.out.println();
        }
        }
        else if(n==3){
            System.out.println("How many bus you have : ");
            m=s.nextInt();
            int[] arr = new int[m];
        for(int i =0;i<m;i++){
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
         System.out.println();
        }
        }
        else if(n==5){
            for(int j=0;j<m;j++){
                obj.proj(j, p, c, num);
            }
        }
}
}
}