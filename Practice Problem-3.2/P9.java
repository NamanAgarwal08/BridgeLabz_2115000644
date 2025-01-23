import java.util.*;

public class P9 {//GreatestFactor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking a number as input
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int greatestFactor = 1;

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest Factor : " + greatestFactor);

        sc.close();
    }
}
