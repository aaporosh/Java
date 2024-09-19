import java.util.Scanner;

interface Sortable {
  void sort(int[] arr);
}
class SelectionSort implements Sortable {
  public void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int mid = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[mid]) {
          mid = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[mid];
      arr[mid] = temp;
    }
  }
}

public class sorting {
    public static void main(String[] args) {
       int n;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the element of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.print("Selection Sort: ");
        printArray(arr);
      }
    
    static void printArray(int[] arr) {
        for (int num: arr) {
          System.out.print(num + " ");
        }
        System.out.println();
      }
    }

