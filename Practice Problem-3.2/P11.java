import java.util.*;

public class P11 {//Factors
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking a number from input to find its factors
        System.out.println("Enter a number to get factors:");
        int n = sc.nextInt();

        System.out.println("Factor(s) are:");
        for (int i = 1; i < n - 1; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }    
}
