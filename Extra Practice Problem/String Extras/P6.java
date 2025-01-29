import java.util.*;

public class P6 { //SubstringOccurrence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        System.out.println("Enter a string to check:");
        String subStr = sc.next();

        int occ = findOccu(str, subStr);
        System.out.println("Occurrence of substring in sentence: " + occ);

        sc.close();
    }
    
    public static int findOccu(String str, String subStr){
        int l = subStr.length();
        int freq = 0;

        for (int i = 0; i <= str.length() - l; i++) {
            if (str.substring(i, i + l).equals(subStr)) {
                freq++;
            }
        }

        return freq;
    }
}
