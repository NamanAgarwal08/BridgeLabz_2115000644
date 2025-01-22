import java.util.*;

public class P16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int numberOfStudents = sc.nextInt();

        System.out.println("Maximum possible handshakes are " + (((numberOfStudents)*(numberOfStudents-1))/2));

    }
}