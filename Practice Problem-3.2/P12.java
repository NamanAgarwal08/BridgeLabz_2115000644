import java.util.*;

public class P12 { //MultipleOfTheNumber
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Multiples of the number are:");
        for (int i = 100; i > 0; i--) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }    
}
