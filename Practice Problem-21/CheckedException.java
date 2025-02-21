import java.io.*;

public class CheckedException {
    public static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}