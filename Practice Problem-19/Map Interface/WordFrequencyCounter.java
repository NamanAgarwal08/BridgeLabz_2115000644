import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        HashMap<String, Integer> hashMap = new HashMap<>();
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toLowerCase();
            StringBuilder cleanWord = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if ((c >= 'a' && c <= 'z') || c == ' ')
                    cleanWord.append(c);
            }
            String[] words = cleanWord.toString().split(" ");
            for (String word : words) {
                if (word.length() > 0) {
                    if (hashMap.containsKey(word))
                        hashMap.put(word, hashMap.get(word) + 1);
                    else
                        hashMap.put(word, 1);
                }
            }
        }
        reader.close();
        System.out.println(hashMap);
    }
}
