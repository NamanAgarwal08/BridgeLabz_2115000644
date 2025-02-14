import java.util.*;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int arr[] = { 3, 2 }; // demo array for check
        System.out.println("Array before sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Array after sorting:");
        printArray(arr);

        sc.close();

    }
}
