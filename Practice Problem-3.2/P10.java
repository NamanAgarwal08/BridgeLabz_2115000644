import java.util.*;

public class P10 {//PowerOfNumber
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking a number as input
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        //taking power as input
        System.out.println("Enter power:");
        int power = sc.nextInt();

        long result = 1;

        for (int i = 0; i < power; i++) {
            result *= num;
        }
        
        System.out.println("Result : " + result);

        sc.close();
    }    
}
