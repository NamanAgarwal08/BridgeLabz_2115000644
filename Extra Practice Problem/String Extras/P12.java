import java.util.*;

public class P12 { //ReplaceWord
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        System.out.println("Enter word to replace:");
        String word = sc.next();

        System.out.println("Enter a word to replace with:");
        String replace = sc.next();

        String ary[] = str.split(" ");

        for (int i = 0; i < ary.length; i++) {
            if (ary[i].equals(word)) {
                ary[i] = replace;
            }
        }

        String ans = "";
        for (String s : ary) {
            ans += (s + " ");
        }

        ans.trim();

        System.out.println("Modified String : " + ans);

        sc.close();

    }
}
