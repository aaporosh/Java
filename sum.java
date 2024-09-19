import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b,sum;
        int i=1;
        System.out.print("Enter the value of a : ");
        a=in.nextInt();

        System.out.print("Enter the value of b : ");
        b=in.nextInt();
        sum=a+b+i;
       // System.out.println(a , b);
        System.out.println("The result of sum :"+sum);
    }
    
}
