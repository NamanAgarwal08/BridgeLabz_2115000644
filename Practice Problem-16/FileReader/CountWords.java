import java.util.*;
import java.io.*;

public class CountWords {
    
    public static void count(String path, String word) {
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            int freq = 0;
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String arr[] = line.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals(word)) {
                        freq++;
                    }
                }

                line = br.readLine();
            }

            System.out.println("Frequency of " + word + " in " + path + " is " + freq);
            fr.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name you want to read:");
        String path = sc.next();

        System.out.println("Enter a word you want to find the count of:");
        String word = sc.next();

        count(path, word);

        sc.close();
    }
}
