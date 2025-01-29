import java.time.*;
import java.time.format.*;

public class P3 { //DateFormatting
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Formatted Date 1: " + today.format(format1));
        System.out.println("Formatted Date 2: " + today.format(format2));
        System.out.println("Formatted Date 3: " + today.format(format3));
    }
}
