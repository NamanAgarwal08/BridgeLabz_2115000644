public class TicketReservationSystem {

    class Node {
        int ticketID;
        String customerName;
        String movieName;
        int seatNumber;
        String bookingTime;

        Node next;

        Node(int ticketID, String customerName, String movieName, String bookingTime, int seatNumber) {
            this.ticketID = ticketID;
            this.customerName = customerName;
            this.movieName = movieName;
            this.bookingTime = bookingTime;
            this.seatNumber = seatNumber;
            this.next = this;
        }
    }

    static Node head = null;
    static Node tail = null;

    int size = 0;


    public void addNewTicket(int ticketID, String customerName, String movieName, String bookingTime, int seatNumber) {
        if (tail == null) {
            head = new Node(ticketID, customerName, movieName, bookingTime, seatNumber);
            tail = head;
        } else {
            tail.next = new Node(ticketID, customerName, movieName, bookingTime, seatNumber);
            tail = tail.next;
            tail.next = head;
        }

        size++;
    }

    
    public void removeTicket(int ticketID) {
        Node temp = head;
        Node prev = null;
        do {
            if (temp.ticketID == ticketID) {
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
                System.out.println("Ticket Removed Successfully!");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
        System.out.println("Ticket not found!");
    }

    
    public void displayAllRecords() {
        if (head == null) {
            System.out.println("No Ticket found!");
            return;
        }
        Node temp = head;
        int i = 0;
        do {
            System.out.println("Record-" + i++);
            System.out.println("TicketID: " + temp.ticketID);
            System.out.println("Customer Name: " + temp.customerName);
            System.out.println("Movie Name: " + temp.movieName);
            System.out.println("Booking Time: " + temp.bookingTime);
            System.out.println("Seat Number: " + temp.seatNumber);
            temp = temp.next;
        } while (temp != head);
    }

    public Node searchRecord(String customerName, String movieName) {
        Node temp = head;
        do {
            if (temp.customerName.equals(customerName) || temp.movieName.equals(movieName)) {
                System.out.println("Ticket Found!");
                return temp;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket not found!");
        return null;
    }

    public int totalBookedTickets() {
        return this.size;
    }
}
