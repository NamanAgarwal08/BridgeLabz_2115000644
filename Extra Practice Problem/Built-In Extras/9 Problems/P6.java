import java.util.*;

public class P6 { //Factorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a number to find it's factorial:");
        int n = sc.nextInt();

        System.out.println("Factorial: " + fact(n));

        sc.close();
    }
    
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
