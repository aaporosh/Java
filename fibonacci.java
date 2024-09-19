import java.util.*;

public class fibonacci {
   int fibo(int n){
        int  first = 0, sec=1,f=0,i=0;
        while(i<n) {
            System.out.print(first+ " ");
            f = first + sec;
            first = sec;
            sec = f;
            i=i+1;
        }
        return 0;
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n= sc.nextInt();
        fibonacci k = new fibonacci();
        k.fibo(n);
        //fibo(n);
        sc.close();
    }
}
