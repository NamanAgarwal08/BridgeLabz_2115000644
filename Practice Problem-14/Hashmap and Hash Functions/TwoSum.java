import java.util.*;

public class TwoSum {
    
    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx1 = -1;
        int idx2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                idx1 = map.get(target - arr[i]);
                idx2 = i;
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] { idx1, idx2 };
    }
    
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 2, 1 };
        int target = 4;
        int ans[] = twoSum(arr, target);
        System.out.println("" + ans[0] + " " + ans[1]);
    }
}
