import java.util.*;

public class FinallyBlock {
    public static void divideNumbers() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(sc.nextInt() / sc.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }

    public static void main(String[] args) {
        divideNumbers();
    }
}