import java.util.*;

public class P11 { //WindChill
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take inputs
        System.out.println("Enter the temperature:");
        double temp = sc.nextDouble();

        System.out.println("Enter wind speed:");
        double windSpeed = sc.nextDouble();

        System.out.println("WindChill : " + calculateWindChill(temp, windSpeed));
        
        sc.close();

    }
    
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

}
