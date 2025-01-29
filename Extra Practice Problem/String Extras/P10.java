import java.util.*;

public class P10 { //RemoveCharacter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a String:");
        String str = sc.next();

        System.out.println("Enter a character to remove:");
        char ch = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println("Modified String: " + sb);

        sc.close();
    }    
}
