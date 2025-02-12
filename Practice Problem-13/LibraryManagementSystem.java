public class LibraryManagementSystem {

    class Node {

        String title;
        String author;
        int bookID;
        String genre;
        boolean availability;

        Node next;
        Node prev;

        Node(String title, String author, int bookID, String genre, boolean availability) {
            this.title = title;
            this.author = author;
            this.bookID = bookID;
            this.genre = genre;
            this.availability = true;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    int size = 0;

    public void addFirst(String title, String author, int bookID, String genre, boolean availability) {
        if (head == null) {
            head = new Node(title, author, bookID, genre, availability);
            tail = head;
        } else {
            Node newNode = new Node(title, author, bookID, genre, availability);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(String title, String author, int bookID, String genre, boolean availability) {
        if (tail == null) {
            head = new Node(title, author, bookID, genre, availability);
            tail = head;
        } else {
            tail.next = new Node(title, author, bookID, genre, availability);
            tail.next.prev = tail;
            tail = tail.next;
        }

        size++;
    }

    // Add node at ith position
    public void addNode(int i, String title, String author, int bookID, String genre, boolean availability) {
        if (i > size + 1 || i < 1) {
            System.out.println("Provide correct position from 1 to " + (size + 1));
            return;
        }
        if (i == 1) {
            Node newNode = new Node(title, author, bookID, genre, availability);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
        } else if (i == size + 1) {
            Node newNode = new Node(title, author, bookID, genre, availability);
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
            temp.next = new Node(title, author, bookID, genre, availability);
            temp.next.prev = temp;
            temp.next.next = temp2;
            temp2.prev = temp.next;
        }
        System.out.println("New book added successfully!");
        size++;
        return;
    }

    public void removeBook(int bookID) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.bookID == bookID) {
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
                System.out.println("Book Removed Successfully!");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        System.out.println("Book not found!");
    }

    public Node searchBook(String author, String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.author.equals(author) || temp.title.equals(title)) {
                System.out.println("A record found");
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
        return null;
    }

    public void changeAvailability(Node n) {
        n.availability = !n.availability;
    }

    public void displayAllBooks() {
        if (head == null) {
            System.out.println("No Book found!");
            return;
        }

        System.out.println("Forward Order:\n");
        Node temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println("Record-" + i++);
            System.out.println("Book Title: " + temp.title);
            System.out.println("Author: " + temp.author);
            System.out.println("bookID: " + temp.bookID);
            System.out.println("Genre: " + temp.genre);
            System.out.println("Availability: " + temp.availability);
            System.out.println();
            temp = temp.next;
        }
        System.out.println("\n\nReverse Order:\n");
        temp = tail;
        i = size;
        while (temp != null) {
            System.out.println("Record-" + i--);
            System.out.println("Book Title: " + temp.title);
            System.out.println("Author: " + temp.author);
            System.out.println("bookID: " + temp.bookID);
            System.out.println("Genre: " + temp.genre);
            System.out.println("Availability: " + temp.availability);
            System.out.println();
            temp = temp.prev;
        }
    }

    public int totalBooks() {
        return this.size;
    }

}