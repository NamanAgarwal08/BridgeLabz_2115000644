import java.util.*;

public class P4 { //TriangularParkRun
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.println("Enter the length of first side in meters:");
        int a = sc.nextInt();

        System.out.println("Enter the length of second side in meters:");
        int b = sc.nextInt();

        System.out.println("Enter the length of third side in meters:");
        int c = sc.nextInt();

        System.out.println("Number of complete rounds to be taken : " + completeRounds(a, b, c));

        sc.close();
        
    }
    
    public static int completeRounds(int a, int b, int c) {
        int peri = a + b + c;

        return 5000 / peri;
    }
}
