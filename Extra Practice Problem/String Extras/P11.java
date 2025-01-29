import java.util.*;

public class P11 { //CheckAnagram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter first string: ");
        String str1 = sc.next();

        System.out.println("Enter second string:");
        String str2 = sc.next();

        int freq[] = new int[126];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 126; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Both strings are anagram.");
        } else {
            System.out.println("Provided strings are not anagram.");
        }

        sc.close();
    }
}
