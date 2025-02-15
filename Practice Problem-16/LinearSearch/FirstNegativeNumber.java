import java.util.*;

public class FirstNegativeNumber {
    
    public static int findIdx(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter integer elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = findIdx(arr);
        if (idx == -1) {
            System.out.println("No negative integer found!");
        } else {
            System.out.println("First negative integer found at index " + idx);
        }

        sc.close();
    }

}