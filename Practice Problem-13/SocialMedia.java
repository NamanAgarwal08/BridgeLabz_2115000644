import java.util.*;

public class SocialMedia {
    
    class Node {

        int userID;
        String name;
        int age;
        List<Node> friendList;

        Node next;

        Node(int userID, String name, int age ) {
            this.userID = userID;
            this.name = name;
            this.age = age;
            this.friendList = new ArrayList<>();
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    int size = 0;


    public void addUser(int userID, String name, int age ) {
        if (tail == null) {
            head = new Node(userID, name, age);
            tail = head;
        } else {
            tail.next = new Node(userID, name, age);
            tail = tail.next;
        }

        size++;
    }

    public void addConnection(int userID1, int userID2) {
        Node temp = head;
        Node friend1 = null;
        Node friend2 = null;
        while (temp != null) {
            if (temp.userID == userID1) {
                friend1 = temp;
            } else if (temp.userID == userID2) {
                friend2 = temp;
            }
            temp = temp.next;
        }

        if (friend1 == null) {
            System.out.println("User with user id " + userID1 + " not found.");
            return;
        }
        if (friend2 == null) {
            System.out.println("User with user id " + userID2 + " not found.");
            return;
        }

        friend1.friendList.add(friend2);
        friend2.friendList.add(friend1);

    }

    public void removeConnection(int userID1, int userID2) {
        Node temp = head;
        Node friend1 = null;
        Node friend2 = null;
        while (temp != null) {
            if (temp.userID == userID1) {
                friend1 = temp;
            } else if (temp.userID == userID2) {
                friend2 = temp;
            }
            temp = temp.next;
        }

        if (friend1 == null) {
            System.out.println("User with user id " + userID1 + " not found.");
            return;
        }
        if (friend2 == null) {
            System.out.println("User with user id " + userID2 + " not found.");
            return;
        }

        friend1.friendList.remove(friend2);
        friend2.friendList.remove(friend1);
    }

    
    public void mutualFriends(int userID1, int userID2) {
        Node temp = head;
        Node friend1 = null;
        Node friend2 = null;
        while (temp != null) {
            if (temp.userID == userID1) {
                friend1 = temp;
            } else if (temp.userID == userID2) {
                friend2 = temp;
            }
            temp = temp.next;
        }

        if (friend1 == null) {
            System.out.println("User with user id " + userID1 + " not found.");
            return;
        }
        if (friend2 == null) {
            System.out.println("User with user id " + userID2 + " not found.");
            return;
        }
        
        for (int i = 0; i < friend1.friendList.size(); i++) {
            for (int j = 0; j < friend2.friendList.size(); j++) {
                if (friend1.friendList.get(i) == friend2.friendList.get(j)) {
                    Node f = friend2.friendList.get(j);
                    System.out.println("Friend Name: " + f.name);
                    System.out.println("Friend ID: " + f.userID);
                    System.out.println();
                    break;
                }
                
            }
        }
    }
    
    public void displayFriends(int userID) {
        Node temp = head;
        Node user = null;
        while (temp != null) {
            if (temp.userID == userID) {
                user = temp;
                break;
            }
            temp = temp.next;
        }
        
        if (user == null) {
            System.out.println("User with user id " + userID + " not found.");
            return;
        }
        
        for (int i = 0; i < user.friendList.size(); i++) {
            Node f = user.friendList.get(i);
            System.out.println("Name: " + f.name);
            System.out.println("User ID: " + f.userID);
            System.out.println();
        }
        
    }
    
    public Node searchRecord(int userID, String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.userID == userID || temp.name.equals(name)) {
                System.out.println("Record Found!");
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Record not found!");
        return null;
    }


    public void countFriends() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.userID);
            System.out.println(temp.name);
            System.out.println("Number of Friends: " + temp.friendList.size());
            temp = temp.next;
        }
    }
    
}