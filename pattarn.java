import java.util.Scanner;

public class pattarn {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the pattern :");
        n=sc.nextInt();
        for(i=1;i<=n;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}


