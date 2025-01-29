import java.util.*;

public class P3 { //PalindromeString
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a String:");
        String str = sc.next();

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
    
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
