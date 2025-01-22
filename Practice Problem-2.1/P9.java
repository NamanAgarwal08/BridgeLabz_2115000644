import java.util.*;

public class P9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Student fees:");
        int fees = sc.nextInt();

        System.out.println("Discount Percentage:");
        int discountPercentage = sc.nextInt();

        double discount = (double) discountPercentage / 100 * 125000;

        System.out.println(
                "The discount amount is INR " + discount + " and final discounted fee is INR " + (fees - discount));

        sc.close();
    }
}
