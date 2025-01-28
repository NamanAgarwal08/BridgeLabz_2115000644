import java.util.*;

public class P9 { //QuotientRemainder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int ans[] = findRemainderAndQuotient(a, b);
        System.out.println("Quotient : " + ans[0]);
        System.out.println("Remainder : " + ans[1]);

        sc.close();

    }
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[] { number / divisor, number % divisor };
    }
}
