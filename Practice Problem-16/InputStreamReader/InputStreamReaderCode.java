import java.io.*;

public class InputStreamReaderCode {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try {
            // Create InputStreamReader to read from System.in
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Create FileWriter to write to the file
            FileWriter fw = new FileWriter(filePath);

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (true) {
                input = br.readLine(); 

                if ("exit".equalsIgnoreCase(input)) { 
                    break;
                }

                fw.write(input + "\n");
            }

            br.close();
            fw.close();

            System.out.println("Input saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
