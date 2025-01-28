import java.util.*;

public class P12 { //TrigonometricFunctions

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an angle in degrees:");
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);

        // Print the results
        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        sc.close();
    }
    
    public static double[] calculateTrigonometricFunctions(double angle) {

        
        // degrees to radians
        double radians = Math.toRadians(angle);

        //sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[] { sine, cosine, tangent };
    }

}
