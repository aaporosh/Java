import java.util.Scanner;

public class loop_1 {
    int sum(int n){
        int i,sum=0;
        for(i=1;i<=n;i++){
            sum=sum+ i;
        }
        return sum;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        n= sc.nextInt();
        loop_1 s = new loop_1();
        System.out.println("Result is : "+s.sum(n));
        sc.close();
    }
    
}
