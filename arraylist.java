import java.util.Scanner;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        int n;
        System.out.println("How many elements you have :");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for(int i=0;i<n;i++){
            arr.add(i);
        }

        System.out.print(arr);
    }
}
