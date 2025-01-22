import java.util.*;

public class P8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Distamce in km:");
        double km = input.nextDouble();

        System.out.println("The total miles is " + (km / 1.6) + " mile for the given " + km + " km");
        
        input.close();
    }
}
