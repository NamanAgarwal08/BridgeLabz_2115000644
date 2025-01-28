import java.util.*;

public class P2 { //Handshakes
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();

        System.out.println("Number of handshakes: " + handShakes(n));

        sc.close();

    }

    public static int handShakes(int n) {
        return (n * (n - 1)) / 2;
    }
}