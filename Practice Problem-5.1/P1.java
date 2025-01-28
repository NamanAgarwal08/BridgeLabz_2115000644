import java.util.*;

public class P1{ // SI
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle rate: ");
        double principle = sc.nextDouble();

        System.out.println("Enter rate: ");
        double rate = sc.nextDouble();
        
        System.out.println("Enter time: ");
        double time = sc.nextDouble();

        System.out.println("Simple Interest : " + simpleInterest(principle, rate, time));

        sc.close();

    }

    public static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

}