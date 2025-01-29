import java.util.*;
import java.time.*; 

public class P2 { //DateArithmetic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Updated Date: " + newDate);

        sc.close();
    }
}
