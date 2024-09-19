import java.util.Scanner;

public class loop {
    int sq_sum(int n){
        int i,sum=0;
        for(i=1;i<=n;i++){
            sum=sum+ (i*i);
        }
        return sum;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        n= sc.nextInt();
        loop s = new loop();
        System.out.println("Result is : "+s.sq_sum(n));
    }
    
}
