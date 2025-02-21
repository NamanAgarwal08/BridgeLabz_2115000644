import java.io.*;

public class StudentData {
    public static void main(String[] args) throws IOException {
        processStudentData();
    }

    static void processStudentData() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));
        dos.writeInt(1);
        dos.writeUTF("PQR");
        dos.writeDouble(3.8);
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"));
        System.out.println(dis.readInt() + " " + dis.readUTF() + " " + dis.readDouble());
        dis.close();
    }
}