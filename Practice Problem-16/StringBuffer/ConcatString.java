import java.util.*;

public class ConcatString{

    public static String concat(String arr[]) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(arr[i]);
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array of strings:");
        int n = sc.nextInt();

        String arr[] = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println("String formed concatinating all strings: " + concat(arr));

        sc.close();
    }
}