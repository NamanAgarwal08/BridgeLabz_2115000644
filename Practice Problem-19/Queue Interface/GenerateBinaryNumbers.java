import java.util.*;

public class GenerateBinaryNumbers {
    

    public static Queue<String> generateNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        Queue<String> ans = new LinkedList<>();
        q.add("1");
        if (n == 1) {
            return q;
        }

        for(int i=0;i<n;i++) {
            String num = q.poll();
            
            ans.add(num);
            
            q.add(num + "0");
            q.add(num + "1");
            
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms you want in binary format starting from 1: ");
        int n = sc.nextInt();

        Queue<String> q = generateNumbers(n);

        System.out.println("Generated Queue: " + q);
        sc.close();
    }
}
