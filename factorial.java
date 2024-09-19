import java.util.Scanner;

public class factorial {
    int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        n=sc.nextInt();
        factorial s=new factorial();
        System.out.println("The result is : "+s.fact(n));    
    }   
}
