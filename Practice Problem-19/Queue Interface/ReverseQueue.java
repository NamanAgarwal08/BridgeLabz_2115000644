import java.util.*;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int ele = q.remove();
        reverse(q);
        q.add(ele);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want to add in queue: ");
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        System.out.println("Initial queue: " + q);

        reverse(q);

        System.out.println("Reversed queue: " + q);

        sc.close();
    }
}