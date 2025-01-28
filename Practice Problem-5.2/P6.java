import java.util.Scanner;

public class P6 { //Conversion3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the given number for the specific conversions.");
        System.out.println("press 1 for farhenheit to celsius.");
        System.out.println("press 2 for celsius to farhenheit.");
        System.out.println("press 3 for pounds to kilograms.");
        System.out.println("press 4 for  kilograms to pounds.");
        System.out.println("press 5 for gallons to liters.");
        System.out.println("press 6 for liters to gallons.");
        int a = sc.nextInt();
        System.out.println("Enter the value:");
        int b= sc.nextInt();
        if(a==1)
        System.out.println(farhenheit2celsius(b));
        else if(a==2)
        System.out.println(celsius2farhenheit(b));
        else if(a==3)
        System.out.println(pounds2kilograms(b));
        else if(a==4)
        System.out.println(kilograms2pounds(b));
        else if(a==5)
        System.out.println(gallons2liters(b));
        else if(a==6)
        System.out.println(liters2gallons(b));
        else
            System.out.println("Enter correct options.");
        
        sc.close();
    }
    static double farhenheit2celsius (double a){
        return (a - 32) * 5 / 9;
    }
    static double celsius2farhenheit (double a){
        return (a * 9 / 5) + 32;
    }
    static double pounds2kilograms (double a){
        return a*0.453592;
    }
    static double kilograms2pounds(double a){
        return a*2.20462;
    }
    static double gallons2liters(double a){
        return a*3.78541;
    }
    static double liters2gallons(double a){
        return a*0.264172;
    }
}
