import java.util.*;

public class P7 {
    public static void main(String[] args) { //ToggleCase
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a String:");
        String str = sc.next();

        System.out.println("Modified String after toggling: " + toggleCase(str));

        sc.close();
    }
    
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 90) {
                sb.append((char) ((int) str.charAt(i) - 32));
            } else {
                sb.append((char) ((int) str.charAt(i) + 32));
            }
        }

        return sb.toString();
    }
}
