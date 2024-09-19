import java.util.Scanner;

public class fac {
    int fact(int n){
         if(n==1 || n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    double number(int n){
        double result = (double) n / fact(n);
        return result;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        n=sc.nextInt();
        fac s=new fac();
        System.out.println("The factorial is : "+s.fact(n));
        System.out.println("The result is : "+s.number(n));
        sc.close();  
    }
}
