import java.util.*;

public class P2 { //MaxOfThreeNumbers
    public static void main(String[] args) {

        int largest = findLargest();

        System.out.println("Largest number: " + largest);


    }
    
    public static int findLargest() {
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.println("Enter first number:");
        int first = sc.nextInt();

        System.out.println("Enter second number:");
        int second = sc.nextInt();

        System.out.println("Enter third number:");
        int third = sc.nextInt();

        sc.close();

        if (first >= second && first >= third) {
            return first;
        } else if (second >= first && second >= third) {
            return second;
        } else {
            return third;
        }
    }
}
