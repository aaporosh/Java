import java.util.Scanner;

public class array {
    public static void main(String[] args){
        int n;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the element of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max =arr[0];
        System.out.print("Maximum value of Array :");
        for(int j=1;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }
            //System.out.print(arr[j]+" ");
        }
        System.out.println(max);
    }
}
