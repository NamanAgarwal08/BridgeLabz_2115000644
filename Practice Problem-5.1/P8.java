import java.util.*;

public class P8 {  //SmallestLargest
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter first Number:");
        int a = sc.nextInt();

        System.out.println("Enter second Number:");
        int b = sc.nextInt();

        System.out.println("Enter third Number:");
        int c = sc.nextInt();

        int ans[] = findSmallestAndLargest(a, b, c);    
        System.out.println("Smallest : " + ans[0] + "\nLargest : " + ans[1]);

        sc.close();

    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        if (number1 <= number2) {
            if (number1 <= number3) {
                smallest = number1;
            }
            else {
                smallest = number3;
            }
        } else if (number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        int largest = number3;
        if (number1 >= number2) {
            if (number1 >= number3) {
                largest = number1;
            } else {
                largest = number3;
            }
        } else if (number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }
        
        return new int[] { smallest, largest };
 
    }
}
