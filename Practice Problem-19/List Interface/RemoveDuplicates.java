import java.util.*;

public class RemoveDuplicates {
    
    public static void removeDuplicate(List<Integer> lst) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < lst.size(); i++) {
            if (!set.contains(lst.get(i))) {
                set.add(lst.get(i));
            } else {
                lst.remove(i);
                i--;
            }
        }
    }
    
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(3);
        lst.add(1);
        lst.add(2);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        System.out.println("Initial List with duplicates");
        System.out.println(lst);
        
        removeDuplicate(lst);
        
        System.out.println("List after removing duplicates");
        System.out.println(lst);
    }
}
