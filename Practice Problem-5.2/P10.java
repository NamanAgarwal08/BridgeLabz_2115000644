import java.util.Scanner;

public class P10 { // BMI
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a[][] = new double[10][3];
        System.out.println("Enter weight of 10 people in kgs.:");
        for(int i=0;i<10;i++)
        {
            a[i][0]  = sc.nextDouble();
        }
        System.out.println("Enter Height of 10 people in cm.:");
        for(int i=0;i<10;i++)
        {
            a[i][1]  = sc.nextDouble();
        }
        for(int i=0;i<10;i++)
        {
            a[i][2]  = bmi(a[i][0],a[i][1]);
        }
        status(a);

        sc.close();
    }
    static double bmi(double w , double h)
    {
        double m = h/100;
        double valuebmi = w/(m*m);
        return valuebmi;
    }
    static void status(double a[][])
    {
        for(int i=0;i<10;i++)
        {
            if(a[i][2]<=18.4)
            System.out.println((i+1)+"is underweight.");
            else if(a[i][2]<=24.9)
            System.out.println((i+1)+"is normal.");
            else if(a[i][2]<39.9)
            System.out.println((i+1)+"is overweight.");
            else
            System.out.println((i+1)+"is obese.");
        }
    }
}
