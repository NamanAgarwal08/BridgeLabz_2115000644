import java.util.*;

public class QueueUsingStacks {
    
    static class Queue<D> {

        Stack<D> stk1 = new Stack<>();
        Stack<D> stk2 = new Stack<>();

        public void add(D data) {
            System.out.println("Adding");
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }

            stk1.push(data);

            while (!stk2.isEmpty()) {
                stk1.push(stk2.pop());
            }
        }

        public D remove() {
            return stk1.pop();
        }

    }
    
    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        q.add(5);
        System.out.println(q.remove());

    }

}