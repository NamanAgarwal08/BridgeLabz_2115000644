import java.util.*;

public class StackUsingQueue {

	static class Stack {

		Queue<Integer> q1;
		Queue<Integer> q2;

		Stack() {

			this.q1 = new LinkedList<>();
			this.q2 = new LinkedList<>();

		}

		public void push(int ele) {

			while (!q1.isEmpty()) {
				q2.add(q1.poll());
			}

			q1.add(ele);

			while (!q2.isEmpty()) {
				q1.add(q2.poll());
			}

		}

		public int pop() {

			return q1.poll();

		}

		public int top() {
			return q1.peek();

		}

		public void display() {

			while (!q1.isEmpty()) {

				int fr = q1.poll();
				q2.add(fr);
				System.out.print(fr + " ");

			}
			System.out.println();

			while (!q2.isEmpty()) {
				q1.add(q2.poll());
			}
		}

		public static void main(String[] args) {

			Stack st = new Stack();

			st.push(1);
			st.push(2);
			st.push(3);
			st.push(4);
			st.push(5);

			System.out.println(st.top());

			st.display();

			System.out.println(st.pop());

			st.display();

		}
	}
}