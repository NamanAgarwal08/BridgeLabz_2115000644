import java.util.*;

public class P7 { //SumOfNaturalNumbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers is " + sumOfNaturalNumbers(n));

        sc.close();
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        int x = 1;
        for (int i = 0; i < n; i++) {
            sum += x++;
        }
        return sum;
    }
}
