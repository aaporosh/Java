import java.util.Scanner;

public class oop_1 {
   // int a = 5;
    //int b = 9;

    void sum_value(int a, int b) {
        int sum = a + b;
        System.out.println("Result is :"+sum);
    }
    public static void main(String[] args) {
        int x,y;
        Scanner c =new Scanner(System.in);
        System.out.println("Enter the number : ");
        x=c.nextInt();
        y=c.nextInt();
        oop_1 v = new oop_1();
        //System.out.println(v.a);
        v.sum_value(x, y);
    }
}
