public class StudentRecord {
    
    class Node {
        int rollNumber;
        String name;
        int age;
        double grade;

        Node next;

        Node(int rollNumber, String name, int age, double grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;
    
    int size = 0;

    public void addFirst(int rollNumber, String name, int age, double grade) {
        if (head == null) {
            head = new Node(rollNumber, name, age, grade);
            tail = head;
        } else {
            Node newNode = new Node(rollNumber, name, age, grade);
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(int rollNumber, String name, int age, double grade) {
        if (tail == null) {
            head = new Node(rollNumber, name, age, grade);
            tail = head;
        } else {
            tail.next = new Node(rollNumber, name, age, grade);
            tail = tail.next;
        }

        size++;
    }

    //Add node at ith position
    public void addNode(int i, int rollNumber, String name, int age, double grade) {
        if (i > size + 1 || i < 1) {
            System.out.println("Provide correct position from 1 to " + (size + 1));
            return;
        }
        if (i == 1) {
            Node newNode = new Node(rollNumber, name, age, grade);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
        }else if (i == size + 1) {
            Node newNode = new Node(rollNumber, name, age, grade);
            tail.next = newNode;
            tail = newNode;
        } else {
            int j = 1;
            Node temp = head;
            while (i-1 != j) {
                temp = temp.next;
                j++;
            }
            Node temp2 = temp.next;
            temp.next = new Node(rollNumber, name, age, grade);
            temp.next.next = temp2;
        }
        System.out.println("New node added successfully!");
        size++;
        return;
    }

    public void deleteRecord(int rollNumber) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                if (prev == null) {
                    head = head.next;
                    if (head == null) {
                        tail = null;
                    }
                } else {
                    if (temp == tail) {
                        prev.next = null;
                        tail = prev;
                    }
                    prev.next = prev.next.next;
                }
                size--;
                System.out.println("Record Deleted Successfully!");
                return;
            }

            prev = temp;
            temp = temp.next;

        }
        System.out.println("Record not found!");
    }

    public Node searchRecord(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Record Found!\nHere are the details:");
                System.out.println("RollNumber: " + temp.rollNumber);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return temp;
            }
            temp = temp.next;
        }
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
        while (temp != null) {
            System.out.println("Record-" + i++);
            System.out.println("RollNumber: " + temp.rollNumber);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public void updateGrade(int rollNumber, double grade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = grade;
                System.out.println("Grade updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found!");
    }

}