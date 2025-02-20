import java.util.*;

public class RotateList {
    
    public static void rotate(List<Integer> lst, int n) {
        n = n % lst.size();

        for (int i = 0; i < n; i++) {
            lst.add(lst.get(i));
        }

        for (int i = 0; i < n; i++) {
            lst.remove(0);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);

        System.out.println(lst);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        rotate(lst, n);

        System.out.println(lst);

    }

}
