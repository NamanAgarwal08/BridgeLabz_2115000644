import java.util.*;

public class Subset {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        boolean isSubset = true;
        for (int i : set1) {
            if (!set2.contains(i)) {
                isSubset = false;
                break;
            }
        }
        if (!isSubset) {
            for (int i : set2) {
                if (!set1.contains(i)) {
                    isSubset = false;
                    break;
                }
            }
        }
        return isSubset;
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

        System.out.println("Is Subset: " + isSubset(set1, set2));

        sc.close();
    }
}
