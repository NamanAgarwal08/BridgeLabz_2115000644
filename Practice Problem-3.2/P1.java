import java.util.*;

public class P1 {//LeapYear
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {// checking century year
                    if (year % 400 == 0) { // checking century leap year
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}