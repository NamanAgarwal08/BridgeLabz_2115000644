import java.util.*;

public class StockSpan {
    
    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice >= stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            s.push(i);
        }
    }

    public static void main(String args[]) {
        int stock[] = { 100, 80, 60, 70, 60, 75, 85 };
        int span[] = new int[stock.length];
        span[0] = 1;
        stockSpan(stock, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}