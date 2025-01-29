import java.util.*;

public class P7 { //GCD_LCM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.println("Enter two numbers to find their GCD and LCM:");
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("LCM: " + lcm(a, b) + "\nGCD: " + gcd(a, b));
        
        sc.close();
    }
    
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        int ans = a > b ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            ans++;
        }

        return ans;
    }
}
