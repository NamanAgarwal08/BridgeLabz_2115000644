import java.util.*;

public class P15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit Price:");
        double unitPrice = sc.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        System.out.println("The total purchase price is INR " + (unitPrice * quantity) + " if the quantity is "
                + quantity + " and unit price is INR " + unitPrice);
        
        sc.close();
    }
}
