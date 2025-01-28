import java.util.Scanner;

public class P11 { // Roots
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b , and c.");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double delta = b*b + 4*a*c;
        root(delta, a, b, c);
        
        sc.close();
    }
    static void root(double delta, double a, double b, double c)
    {
        if(delta>0)
        {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Roots are "+x1+" , "+x2);
        }
        else if(delta==0)
        {
            double x = -b/2*a;
            System.out.println("Root is: "+x);
        }
        else
        System.out.println("NO ROOTS OF THIS EQUATION.");
    }
}
