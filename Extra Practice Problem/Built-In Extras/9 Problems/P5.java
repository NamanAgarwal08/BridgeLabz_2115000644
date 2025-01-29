import java.util.*;

public class P5 { //StringPalindromeCheck
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }

        sc.close();
    }
    
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
