public class NthFromEnd extends Object {
    

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node nthFromEnd(Node head, int n) {
        Node fast = head;
        for (int i = 0; i < n && fast != null; i++) {
            fast = fast.next;
        }
        Node slow = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
    
    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('D');
        head.next.next.next.next = new Node('E');

        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.println(nthFromEnd(head, 2).data);
        
    }
}
