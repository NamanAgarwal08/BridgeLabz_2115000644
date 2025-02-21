import java.io.*;

public class PipedCommunication {
    public static void main(String[] args) throws IOException {
        processPipedCommunication();
    }

    static void processPipedCommunication() throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        new Thread(() -> {
            try {
                pos.write("Hello".getBytes());
                pos.close();
            } catch (IOException ignored) {
            }
        }).start();
        new Thread(() -> {
            try {
                int d;
                while ((d = pis.read()) != -1)
                    System.out.print((char) d);
                pis.close();
            } catch (IOException ignored) {
            }
        }).start();
    }
}