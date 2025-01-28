import java.util.Scanner;

public class P5 { //Conversion2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the given number for the specific conversions.");
        System.out.println("press 1 for yard to feet.");
        System.out.println("press 2 for feet to yard.");
        System.out.println("press 3 for meter to inch");
        System.out.println("press 4 for inch to meter");
        int a = sc.nextInt();
        System.out.println("Enter the value:");
        int b= sc.nextInt();
        if(a==1)
        System.out.println(YardToFeet(b));
        else if(a==2)
        System.out.println(FeetToYard(b));
        else if(a==3)
        System.out.println(MeterToInch(b));
        else if(a==4)
        System.out.println(InchToMeter(b));
        else
            System.out.println("Enter correct options.");
        
        sc.close();
    }
    static double YardToFeet(double a){
        return a*3;
    }
    static double FeetToYard(double a){
        return a*0.33;
    }
    static double MeterToInch(double a){
        return a*39.37;
    }
    static double InchToMeter(double a){
        return a*0.0254;
    }
}
