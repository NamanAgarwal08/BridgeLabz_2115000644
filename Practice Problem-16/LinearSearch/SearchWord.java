import java.util.*;

public class SearchWord {
    
    public static String findSentence(String arr[], String word) {
        for (int i = 0; i < arr.length; i++) {
            String sentence = arr[i];
            String words[] = sentence.split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(word)) {
                    return sentence;
                }
            }
        }

        return null;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        String arr[] = new String[n];

        System.out.println("Enter " + n + " sentences:");
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Enter a word to find first sentence containing it:");
        String word = sc.next();

        String sentence = findSentence(arr, word);
        if (sentence == null) {
            System.out.println("No sentence found containing \"" + word+ "\"");
        } else {
            System.out.println("Sentence found: " + sentence);
        }

        sc.close();
    }
}
