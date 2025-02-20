import java.util.*;

public class SymmetricDifference {
    
    public static Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> diff = new HashSet<>();
        for (int i : set1) {
            if (!set2.contains(i)) {
                diff.add(i);
            }
        }

        for (int i : set2) {
            if (!set1.contains(i)) {
                diff.add(i);
            }
        }

        return diff;
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

        System.out.println("Symmetric Difference: " + getSymmetricDifference(set1, set2));

        sc.close();
    }
}
