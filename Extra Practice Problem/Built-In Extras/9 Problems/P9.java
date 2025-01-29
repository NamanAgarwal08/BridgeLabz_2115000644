import java.util.*;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter 1 to add to numbers.");
        System.out.println("Enter 2 to subtract to numbers.");
        System.out.println("Enter 3 to divide to numbers.");
        System.out.println("Enter 4 to multiply to numbers.");
        int n = sc.nextInt();

        while (true) {
            if (n == 1) {
                sum();
                break;
            } else if (n == 2) {
                sub();
                break;
            } else if (n == 3) {
                div();
                break;
            } else if (n == 4) {
                mul();
                break;
            } else {
                System.out.println("Invalid Input! Enter Again.");
                n = sc.nextInt();
            }
        }

        sc.close();

    }
    
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Sum: " + (a + b));

        sc.close();
    }
    public static void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Subtraction: " + (a - b));

        sc.close();
    }
    public static void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Division: " + (a / b));

        sc.close();
    }
    public static void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Multiply: " + (a * b));

        sc.close();
    }
}
