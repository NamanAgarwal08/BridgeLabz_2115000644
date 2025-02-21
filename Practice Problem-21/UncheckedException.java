import java.util.*;

public class UncheckedException {
    public static void divideNumbers() {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        sc.close();
    }

    public static void main(String[] args) {
        divideNumbers();
    }
}