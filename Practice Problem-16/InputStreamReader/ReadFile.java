import java.io.*;
import java.util.*;

public class ReadFile {

    public static void read(String path) {
        try (FileInputStream fis = new FileInputStream(path);
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path to read the file:");
        String path = sc.next();

        read(path);

        sc.close();
    }
    
}
