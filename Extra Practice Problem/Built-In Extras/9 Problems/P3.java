import java.util.*;

public class P3 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime Number.");
        } else {
            System.out.println("Not a Prime Number.");
        }

        sc.close();
    }
    
    public static boolean isPrime(int n) {
        for(int i =2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
