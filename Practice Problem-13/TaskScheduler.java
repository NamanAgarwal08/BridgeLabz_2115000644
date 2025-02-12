public class TaskScheduler {

    class Node {
        int taskID;
        String taskName;
        String priority;
        String dueDate;

        Node next;

        Node(int taskID, String taskName, String priority, String dueDate) {
            this.taskID = taskID;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = this;
        }
    }

    static Node head = null;
    static Node tail = null;

    int size = 0;

    public void addFirst(int taskID, String taskName, String priority, String dueDate) {
        if (head == null) {
            head = new Node(taskID, taskName, priority, dueDate);
            tail = head;
        } else {
            Node newNode = new Node(taskID, taskName, priority, dueDate);
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }

    public void addLast(int taskID, String taskName, String priority, String dueDate) {
        if (tail == null) {
            head = new Node(taskID, taskName, priority, dueDate);
            tail = head;
        } else {
            tail.next = new Node(taskID, taskName, priority, dueDate);
            tail = tail.next;
            tail.next = head;
        }

        size++;
    }

    // Add node at ith position
    public void addNode(int i, int taskID, String taskName, String priority, String dueDate) {
        if (i > size + 1 || i < 1) {
            System.out.println("Provide correct position from 1 to " + (size + 1));
            return;
        }
        if (i == 1) {
            Node newNode = new Node(taskID, taskName, priority, dueDate);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
            tail.next = head;
        } else if (i == size + 1) {
            Node newNode = new Node(taskID, taskName, priority, dueDate);
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            int j = 1;
            Node temp = head;
            while (i - 1 != j) {
                temp = temp.next;
                j++;
            }
            Node temp2 = temp.next;
            temp.next = new Node(taskID, taskName, priority, dueDate);
            temp.next.next = temp2;
        }
        System.out.println("New node added successfully!");
        size++;
        return;
    }

    public void deleteRecord(int taskID) {
        Node temp = head;
        Node prev = null;
        do{
            if (temp.taskID == taskID) {
                if (temp == head) {
                    head = head.next;
                    if (head == null) {
                        tail = null;
                    }
                    tail.next = head;
                } else if (temp == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = prev.next.next;
                }
                size--;
                System.out.println("Record Deleted Successfully!");
                return;
            }

            prev = temp;
            temp = temp.next;

        }
        while (temp != head); 
        System.out.println("Record not found!");
    }

    public Node searchRecord(int taskID) {
        Node temp = head;
        do {
            if (temp.taskID == taskID) {
                System.out.println("Record Found!");
                return temp;
            }
            temp = temp.next;
        }
        while (temp != head); 
        System.out.println("Record not found!");
        return null;
    }

    public void displayAllRecords() {
        if (head == null) {
            System.out.println("No record found!");
            return;
        }
        Node temp = head;
        int i = 0;
        do {
            System.out.println("Record-" + i++);
            System.out.println("RollNumber: " + temp.taskID);
            System.out.println("Name: " + temp.taskName);
            System.out.println("Age: " + temp.priority);
            System.out.println("Grade: " + temp.dueDate);
            temp = temp.next;
        }
        while (temp != head); 
    }

    public void updateGrade(int taskID, String dueDate) {
        Node temp = head;
        do{
            if (temp.taskID == taskID) {
                temp.dueDate = dueDate;
                System.out.println("Due-date updated successfully!");
                return;
            }
            temp = temp.next;
        }
        while (temp != head);
        System.out.println("Record not found!");
    }

}
