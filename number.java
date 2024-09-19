import java.util.Scanner;

public class number {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        a= sc.nextInt();
        if(a>0){
            System.out.println("Is a positive number");
        }
        else if(a<0){
            System.out.println("Is a negative number");
        }
        else if(a==0){
            System.out.println("Is a zero");
        }
        else{
            System.out.println("special cherecter");
        }
  }
}
