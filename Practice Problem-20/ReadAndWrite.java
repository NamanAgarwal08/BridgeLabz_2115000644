import java.io.*;
import java.util.*;

public class ReadAndWrite {
    
    public static void copyFile(String src, String des) {
        try {
            FileInputStream fs = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(des);

            int data;
            while ((data = fs.read()) != -1) {
                fos.write(data);
            }

            System.out.println("Copied!");

            fs.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path of source file to copy data: ");
        String src = sc.next();

        System.out.print("Enter destination file name if exists otherwise enter new file name: ");
        String des = sc.next();

        copyFile(src, des);

        sc.close();
    }

}