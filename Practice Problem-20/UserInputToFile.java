import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {
        saveUserInput();
    }

    static void saveUserInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("user_data.txt");
        fw.write(br.readLine() + "\n" + br.readLine() + "\n" + br.readLine());
        fw.close();
    }
}