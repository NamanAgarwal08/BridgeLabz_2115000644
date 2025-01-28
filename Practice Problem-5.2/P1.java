import java.util.*;

public class P1 { //Factors
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int fac[] = factors(n);

        int sum = 0;
        int sumOfSquare = 0;
        int product = 1;

        for (int i = 0; i < fac.length; i++) {
            sum += fac[i];
            sumOfSquare += Math.pow(fac[i], 2);
            product *= fac[i];
        }

        System.out.println("Sum of factors: " + sum);
        System.out.println("Sum of squares of factors: " + sumOfSquare);
        System.out.println("Product of factors: " + product);

        sc.close();
    }
    
    public static int[] factors(int n) {
        int size = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                size++;
            }
        }

        int fac[] = new int[size];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                fac[j++] = i;
            }
        }

        return fac;
    }
}