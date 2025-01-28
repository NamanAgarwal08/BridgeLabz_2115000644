import java.util.Scanner;

public class P4 { //Conversion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the given number for the specific conversions.");
        System.out.println("press 1 for Km to miles.");
        System.out.println("press 2 for miles to km.");
        System.out.println("press 3 for meter to feets");
        System.out.println("press 4 for feets to meter");
        int a = sc.nextInt();
        System.out.println("Enter the value:");
        int b= sc.nextInt();
        if(a==1)
        System.out.println(KmToMiles(b));
        else if(a==2)
        System.out.println(MilesToKm(b));
        else if(a==3)
        System.out.println(MeterToFeet(b));
        else if(a==4)
        System.out.println(FeetToMeter(b));
        else
            System.out.println("Enter correct options.");

        sc.close();
    }
    static double KmToMiles(double a){
        return a*0.621371;
    }
    static double MilesToKm(double a){
        return a*1.60934;
    }
    static double MeterToFeet(double a){
        return a*3.28084;
    }
    static double FeetToMeter(double a){
        return a*0.3048;
    }
}
/* 
 intro
  java 
  features
  oopsc cincept
  jvm 
  polymorphim rumtime compile time
  prime number, prime seive
  git repo, main feature code push , merege main

*/
