import java.util.*;

public class P9 { //MostFrequentCharacter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a string:");
        String str = sc.next();

        int freq[] = new int[126];
        int f = 0;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
            if (f < freq[str.charAt(i)]) {
                f = freq[str.charAt(i)];
                ch = str.charAt(i);
            }
        }

        System.out.println("Most frequent character is " + ch);

        sc.close();

    }    
}
