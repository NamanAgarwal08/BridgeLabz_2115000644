public class UndoRedoTextEditor {
    
    int limit = 0;
    
    UndoRedoTextEditor(int limit) {
        this.limit = limit;
    }

    class Node {
    
        String text;

        Node next;
        Node prev;

        Node(String text) {
            this.text = text;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    Node current = null;
    int size = 0;


    public void addState(String text) {
        if (tail == null) {
            head = new Node(text);
            tail = head;
            current = head;
        } else {
            tail.next = new Node(text);
            tail.next.prev = tail;
            tail = tail.next;
            current = tail;
        }

        size++;
        if (size > limit) {
            head = head.next;
            size--;
        }
    }


    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No state found!");
        }
    }


    public void redo() {
        if (current.next != null) {
            current = current.next;
        } else {
            System.out.println("No record found!");
        }
    }


    public void displayCurrentState() {
        System.out.println(current.text);
    }

}