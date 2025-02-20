import java.util.*;

public class SetToList {
    
    public static List<Integer> setToList(Set<Integer> set) {
        List<Integer> lst = new ArrayList<>();
        for (int i : set) {
            lst.add(i);
        }

        Collections.sort(lst);

        return lst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of elements you want to add in set: ");
        int n1 = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) {
            set.add(sc.nextInt());
        }

        System.out.print("Set to Sorted List: ");
        List<Integer> lst = setToList(set);
        System.out.println(lst);

        sc.close();
    }
}
