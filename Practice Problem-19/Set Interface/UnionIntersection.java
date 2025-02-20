import java.util.*;

public class UnionIntersection {
    
    public static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>();
        for (int i : set1) {
            union.add(i);
        }
        for (int i : set2) {
            union.add(i);
        }

        return union;
    }

    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>();

        for (int i : set2) {
            if (set1.contains(i)) {
                intersection.add(i);
            }
        }

        return intersection;
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

        Set<Integer> union = getUnion(set1, set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = getIntersection(set1, set2);
        System.out.println("Intersection: " + intersection);

        sc.close();
    }

}
