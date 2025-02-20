import java.util.*;

public class EqualSets {

    public static boolean isEqual(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() != set2.size()) {
            return false;
        }
        for (int i : set1) {
            if (!set2.contains(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of elements you want to add in set1: ");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }


        System.out.print("Enter Number of elements you want to add in set2: ");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }


        if (isEqual(set1, set2)) {
            System.out.println("Set are equal!");
        } else {
            System.out.println("Sets are not equal!");
        }

        sc.close();
    }

}
