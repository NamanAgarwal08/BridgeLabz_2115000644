import java.util.*;

public class P11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + a + " and "
                + b + " is " + (a + b) + ", " + (a - b) + ", " + (a * b) + " and " + (a / b));

        sc.close();
    }
}
