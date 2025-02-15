import java.util.*;

public class RemoveDuplicateCharacter {
    
    public static String removeDuplicate(String str) {

        HashSet<Character> set = new HashSet<>();
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                newStr.append(ch);
                set.add(ch);
            }
        }

        return newStr.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to remove duplicate characters:");
        String str = sc.next();

        System.out.println("Modified String: " + removeDuplicate(str));

        sc.close();
    }
}
