import java.util.*;

public class SortStack {
    
    public static void sort(Stack<Integer> stk) {
        if (stk.isEmpty()) {
            return;
        }
        int ele = stk.pop();
        sort(stk);

        Stack<Integer> dummy = new Stack<>();
        while (!stk.isEmpty() && stk.peek() < ele) {
            dummy.push(stk.pop());
        }
        stk.push(ele);
        while(!dummy.isEmpty()){
            stk.push(dummy.pop());
        }
    }
}
