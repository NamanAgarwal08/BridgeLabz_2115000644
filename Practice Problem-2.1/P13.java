import java.util.*;

public class P13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the perameter of square:");
        double parameter = sc.nextDouble();

        System.out.println("The length of the sode is " + (parameter / 4) + " whose parameter is " + (parameter));
        
        sc.close();
    }
}
