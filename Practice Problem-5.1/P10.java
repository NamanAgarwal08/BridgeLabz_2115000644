import java.util.*;

public class P10 { //ChololateDistribution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take inputs
        System.out.println("Enter number of children:");
        int numberOfChildren = sc.nextInt();

        System.out.println("Enter  number of chocolates:");
        int numberOfChocolates = sc.nextInt();

        int ans[] = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Number of chocolates each gets:" + ans[0]);
        System.out.println("Number of remaining chocolates:" + ans[1]);

        sc.close();

    }
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[] { number / divisor, number % divisor };
    } 

}
