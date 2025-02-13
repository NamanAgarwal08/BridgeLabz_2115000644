import java.util.*;

class SlidingWindowMaximum {

    public static void main(String[] args) {

        int arr[] = { 3, 6, 7, 1, 0, 6, 7, 9 };
        int k = 4;

        displayMax(arr, k);
    }

    public static void displayMax(int arr[], int k){
        Deque<Integer> dq = new LinkedList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && (i - dq.peek()) >= k)
                dq.poll();

            while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()])
                dq.pollLast();

            dq.addLast(i);

            if (i >= k - 1)
                System.out.println("Maximum in the window is : " + arr[dq.peek()]);
        }
    }

}