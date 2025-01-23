import java.util.*;

public class P7 { //BMI
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take weight in kg
        System.out.println("Enter weight in kg:");
        double weight = sc.nextDouble();

        //take height in cm
        System.out.println("Enter height in cm:");
        double height = sc.nextDouble();

        //height in meter;
        height=height/100;

        double bmi = weight / height / height;

        if (bmi <= 18.4) {
            System.out.println("BMI : " + bmi + "\nStatus : Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI : " + bmi + "\nStatus : Normal");
        } else if (bmi >= 25 && bmi <= 39.9){
            System.out.println("BMI : " + bmi + "\nStatus : Overweight");
        } else {
            System.out.println("BMI : " + bmi + "\n Status : Obese");
        }

        sc.close();

    }    
}
