import java.util.*;

public class P5 { //PositiveNegativeZero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(checkNumber(n));

        sc.close();
    }
    
    public static int checkNumber(int n) {
        if (n < 0) {
            return -1;
        }
        if (n > 0) {
            return 1;
        }
        return 0;
    }
}
