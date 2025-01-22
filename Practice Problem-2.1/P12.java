import java.util.*;

public class P12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height of triangle in cm;");
        double h = sc.nextDouble();

        System.out.println("Enter base of triangle in cm:");
        double b = sc.nextDouble();

        System.out.println(
                "Area in square cm is " + (b * h / 2) + " and in square inches is " + (b * h / 2 / 2.54 / 2.54));
        
        sc.close();
    }
}
