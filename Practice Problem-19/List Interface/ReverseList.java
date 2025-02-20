import java.util.*;

public class ReverseList {
    
    public static void reverse(List<Integer> lst) {
        int len = lst.size();

        for (int i = 0; i <= len / 2; i++) {
            int temp = lst.get(i);
            lst.set(i, lst.get(len - 1 - i));
            lst.set(len - 1 - i, temp);
        }
    }

    public static void printList(List<Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        printList(lst);

        reverse(lst);

        printList(lst);
    }

}