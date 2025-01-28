import java.util.*;

public class P3 { //Handshakes2

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people: ");
        int numberOfStudents = sc.nextInt();

        System.out.println("Number of handshakes: " + ((numberOfStudents * (numberOfStudents - 1)) / 2));

        sc.close();

    }
    
}