import java.io.*;

public class ReadFile {

    public static void read(String path) {
        try{

            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            fr.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    
    public static void main(String[] args) {
        String path = "text.txt";
        read(path);
    }
}