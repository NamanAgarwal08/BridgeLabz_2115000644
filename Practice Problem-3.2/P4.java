import java.util.*;

public class P4 {//IsPrime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //taking input
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
