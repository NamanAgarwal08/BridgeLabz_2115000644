import java.io.*;

public class TryWithResources {
    public static void readFirstLine() {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public static void main(String[] args) {
        readFirstLine();
    }
}
