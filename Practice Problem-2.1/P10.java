import java.util.*;

public class P10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height in cm:");
        double h = sc.nextDouble();

        System.out.println(
                "Your Height in cm is " + h + " while in feet is " + (h / 12 / 2.54) + " and inches is " + (h / 2.54));
        
        sc.close();

    }
}