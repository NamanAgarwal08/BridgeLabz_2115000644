import java.util.*;

public class CountingSort {

    public static void countingSort(int arr[]) {
        int n = arr.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] freqArray = new int[max + 1];

        for (int i = 0; i < n; i++) {
            freqArray[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            freqArray[i] += freqArray[i - 1];
        }

        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            ans[freqArray[arr[i]] - 1] = arr[i];
            freqArray[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
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
        // int arr[] = { 3, 2, 5, 1, 9, 5, 0, 9}; // demo array for check
        System.out.println("Array before sorting:");
        printArray(arr);

        countingSort(arr);

        System.out.println("Array after sorting:");
        printArray(arr);

        sc.close();
    }
}