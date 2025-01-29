import java.util.*;

public class P2 { //StringReverse
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a String:");
        String str = sc.next();

        str = reverseString(str);

        System.out.println("Reversed String: " + str);

        sc.close();

    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        
        return sb.toString();
    }
}
