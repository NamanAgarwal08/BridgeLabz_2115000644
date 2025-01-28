import java.util.*;

public class P6 { //SpringSeason
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter month number:");
        int month = sc.nextInt();

        System.out.println("Enter date:");
        int date = sc.nextInt();

        System.out.println(springSeason(month, date));

        sc.close();
    }
    
    public static String springSeason(int m, int d){
        if (m >= 3 && m <= 6) {
            if (m == 3 && d < 20) {
                return "Not a Spring Season";
            }
            if (m == 6 && d > 20) {
                return "Not a Spring Season";
            }
            return "Spring Season";
        } else {
            return "Not a Spring Season";
        }
    }
}
