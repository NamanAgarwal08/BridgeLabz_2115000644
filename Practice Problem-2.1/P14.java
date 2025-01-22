import java.util.*;

public class P14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in feets:");
        double d = sc.nextDouble();

        System.out.println(
                "Distance in feet is " + d + ", in yards is " + (d / 3) + " and in miles is " + (d / 3 / 1760));
        
        sc.close();

    }
}
