import java.util.*;

public class P8 { //LexicographicalComparison
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter first String: ");
        String str1 = sc.next();
        System.out.println("Enter second String: ");
        String str2 = sc.next();
        
        if (str1.equals(str2)) {
            System.out.println("Both words are same.");
        } else {
            int i = 0;
            int j = 0;
            boolean b = false;
            while (i < str1.length() && j < str2.length()) {
                if (str1.charAt(i) < str2.charAt(j)) {
                    b = true;
                    break;
                } else if (str1.charAt(i) > str2.charAt(j)) {
                    String str = str1;
                    str1 = str2;
                    str2 = str;
                    b = true;
                    break;
                }
                i++;
                j++;
            }

            if (!b && i != j) {
                if (j < i) {
                    String str = str1;
                    str1 = str2;
                    str2 = str;
                }
            }

            System.out.println(str1 + " comes before " + str2 + " in lexicographical order.");

        }
        
        sc.close();

    }    
}
