import java.util.Scanner;

public class star {
    int st(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();   
        }
        return 0;
    }
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        star s = new star();
        s.st(n);
    }
}
