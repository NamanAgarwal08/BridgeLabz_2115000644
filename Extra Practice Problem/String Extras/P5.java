import java.util.*;

public class P5 { //LongestWordInSentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        System.out.println("Longest Word: " + longestWord(str));

        sc.close();

    }
    
    public static String longestWord(String str){
        String ary[] = str.split(" ");

        String ans = "";

        for (int i = 0; i < ary.length; i++) {
            if (ans.length() < ary[i].length()) {
                ans = ary[i];
            }
        }

        return ans;
    }
}
