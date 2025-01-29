import java.util.*;

public class P4 { //RemoveDuplicates
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a String:");
        String str = sc.next();

        str = removeDuplicates(str);

        System.out.println("Modified String: " + str);

        sc.close();

    }
    
    public static String removeDuplicates(String str) {

        boolean chars[] = new boolean[126];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!chars[(int) str.charAt(i)]) {
                sb.append(str.charAt(i));
                chars[(int) str.charAt(i)] = true;
            }
        }
        
        return sb.toString();
    }
}
