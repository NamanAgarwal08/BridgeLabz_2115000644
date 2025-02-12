public class MovieManagementSystem {

    class Node {
    
        String title;
        String director;
        int year;
        double rating;

        Node next;
        Node prev;

        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    int size = 0;

    public void addFirst(String title, String director, int year, double rating) {
        if (head == null) {
            head = new Node(title, director, year, rating);
            tail = head;
        } else {
            Node newNode = new Node(title, director, year, rating);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(String title, String director, int year, double rating) {
        if (tail == null) {
            head = new Node(title, director, year, rating);
            tail = head;
        } else {
            tail.next = new Node(title, director, year, rating);
            tail.next.prev = tail;
            tail = tail.next;
        }

        size++;
    }

    // Add node at ith position
    public void addNode(int i, String title, String director, int year, double rating) {
        if (i > size + 1 || i < 1) {
            System.out.println("Provide correct position from 1 to " + (size + 1));
            return;
        }
        if (i == 1) {
            Node newNode = new Node(title, director, year, rating);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
        } else if (i == size + 1) {
            Node newNode = new Node(title, director, year, rating);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            int j = 1;
            Node temp = head;
            while (i - 1 > j) {
                temp = temp.next;
                j++;
            }
            Node temp2 = temp.next;
            temp.next = new Node(title, director, year, rating);
            temp.next.prev = temp;
            temp.next.next = temp2;
            temp2.prev = temp.next;
        }
        System.out.println("New record added successfully!");
        size++;
        return;
    }

    public void deleteRecord(String title) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head == null) {
                        tail = null;
                    } else {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                        prev.next = null;
                        tail = prev;
                } else {
                    prev.next.next.prev = prev;
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

    public Node searchRecord(String director , double rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.director == director || temp.rating == rating) {
                System.out.println("A record found");
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

        System.out.println("Forward Order:\n");
        Node temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println("Record-" + i++);
            System.out.println("Movie Title: " + temp.title);
            System.out.println("Director: " + temp.director);
            System.out.println("Year of release: " + temp.year);
            System.out.println("Rating: " + temp.rating);
            System.out.println();
            temp = temp.next;
        }
        System.out.println("\n\nReverse Order:\n");
        temp = tail;
        i = size;
        while (temp != null) {
            System.out.println("Record-" + i--);
            System.out.println("Movie Title: " + temp.title);
            System.out.println("Director: " + temp.director);
            System.out.println("Year of release: " + temp.year);
            System.out.println("Rating: " + temp.rating);
            System.out.println();
            temp = temp.prev;
        }
    }

    public void updateGrade(String title, double rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = rating;
                System.out.println("Rating updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found!");
    }

}