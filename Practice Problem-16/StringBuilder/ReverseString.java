import java.util.*;

public class ReverseString {
    
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to reverse:");
        String str = sc.next();

        System.out.println("Reversed String: " + reverse(str));

        sc.close();
    }
}