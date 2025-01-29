import java.util.*;

public class P8 { //TemperatureConversion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        while (true) {

            System.out.println("Enter 1 to convert from Fahrenheit to Celcius");
            System.out.println("Enter 2 to convert from Celcius to Fahrenheit");
            int n = sc.nextInt();

            if (n == 1) {
                fToC();
                break;
            } else if (n == 2) {
                cToF();
                break;
            } else {
                System.out.println("Invalid Input!");
            }

        }

        sc.close();
    }
    
    public static void fToC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        double f = sc.nextDouble();

        System.out.println("In Celcius : " + (f - (double) 32) * 5 / 9);

        sc.close();

    }
    
    public static void cToF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        double c = sc.nextDouble();

        System.out.println("In Celcius : " + (c * 9 / 5 + 32));
        
        sc.close();

    }
}
