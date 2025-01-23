import java.util.*;

public class P6 {// FizzBuzz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // checking if it is a positive number
        if (n > 0) {
            int i = 0;
            while (i <= n) {
                if (i % 15 == 0 && i != 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 && i != 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0 && i != 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;
            }
        }

        sc.close();

    }
}
