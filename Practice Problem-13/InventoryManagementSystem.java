public class InventoryManagementSystem {

    class Node {
        int itemID;
        String name;
        int quantity;
        double price;

        Node next;

        Node(int itemID, String name, int quantity, double price) {
            this.itemID = itemID;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    int size = 0;

    public void addFirst(int itemID, String name, int quantity, double price) {
        if (head == null) {
            head = new Node(itemID, name, quantity, price);
            tail = head;
        } else {
            Node newNode = new Node(itemID, name, quantity, price);
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(int itemID, String name, int quantity, double price) {
        if (tail == null) {
            head = new Node(itemID, name, quantity, price);
            tail = head;
        } else {
            tail.next = new Node(itemID, name, quantity, price);
            tail = tail.next;
        }

        size++;
    }

    // Add node at ith position
    public void addNode(int i, int itemID, String name, int quantity, double price) {
        if (i > size + 1 || i < 1) {
            System.out.println("Provide correct position from 1 to " + (size + 1));
            return;
        }
        if (i == 1) {
            Node newNode = new Node(itemID, name, quantity, price);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
        } else if (i == size + 1) {
            Node newNode = new Node(itemID, name, quantity, price);
            tail.next = newNode;
            tail = newNode;
        } else {
            int j = 1;
            Node temp = head;
            while (i - 1 != j) {
                temp = temp.next;
                j++;
            }
            Node temp2 = temp.next;
            temp.next = new Node(itemID, name, quantity, price);
            temp.next.next = temp2;
        }
        System.out.println("New item added successfully!");
        size++;
        return;
    }

    public void removeItem(int itemID) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.itemID == itemID) {
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
                System.out.println("Item Removed Successfully!");
                return;
            }

            prev = temp;
            temp = temp.next;

        }
        System.out.println("Item not found!");
    }

    public void updateQuantity(int itemID, int quantity) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = quantity;
                System.out.println("Quantity updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    public Node searchRecord(int itemID, String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemID == itemID || temp.name.equals(name)) {
                System.out.println("Record Found!");
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Record not found!");
        return null;
    }

    public void displayInventoryValue() {
        if (head == null) {
            System.out.println("No item found!");
            return;
        }
        Node temp = head;
        double totVal = 0;
        while (temp != null) {
            totVal += (temp.price * temp.quantity);
            temp = temp.next;
        }

        System.out.println("Total value of inventory is " + totVal);
    }
    
    public Node sortPrice(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow.next;
        slow.next = null;
        Node left = sortPrice(head);
        Node right = sortPrice(mid);

        Node newHead = new Node(-1,"-1",-1,-1);
        Node temp = newHead;
        Node temp1 = left;
        Node temp2 = right;
        while (temp1 != null && temp2 != null) {
            if (temp1.price < temp2.price) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if (temp1 != null) {
            temp.next = temp1;
        } else {
            temp.next = temp2;
        }
        
        this.head = newHead.next;
        return head;
    }

}