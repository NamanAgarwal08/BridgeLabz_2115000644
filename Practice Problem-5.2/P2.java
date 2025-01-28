import java.util.*;

public class P2 { // SumOfNumbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int recSum = rec(n);
        int formulaSum = (n * (n + 1)) / 2;

        System.out.println("By Formula: " + formulaSum);
        System.out.println("By Recursion: " + recSum);

        sc.close();

    }
    
    public static int rec(int n) {
        if (n == 0) {
            return 0;
        }
        return n + rec(n - 1);
    }
}
