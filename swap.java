import java.util.Scanner;

public class swap {
    int swap_number(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("X="+a+" "+"Y="+b);
        return 0;
    }
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x :");
        x = in.nextInt();
        System.out.print("Enter the value of y :");
        y = in.nextInt();
        System.out.println("Befor sawpping");
        System.out.println("X="+x+" "+"Y="+y);
        System.out.println("After sawpping");
        swap num = new swap();
        num.swap_number(x, y);
        in.close();
    }
}
