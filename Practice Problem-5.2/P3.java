import java.util.*;

public class P3 { //LeapYear
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        int output = leapYear(year);
        if(output == 0){
            System.out.println("Not a Leap Year.");
        } else {
            System.out.println("Leap Year.");
        }

        sc.close();

    }

    public static int leapYear(int year) {
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
