import java.util.*;

public class P4 { //FibonacciSeries
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter number of terms you want of Fibonacci series:");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();

    }
    
    public static void printFibonacci(int n){
        if (n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            System.out.println("0 1");
            return;
        }
        int fibo[] = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }
        System.out.println();
    }
}
