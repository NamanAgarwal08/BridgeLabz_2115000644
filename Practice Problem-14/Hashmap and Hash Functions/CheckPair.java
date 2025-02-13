import java.util.*;

public class CheckPair {
    
    public static boolean checkTwoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return true;
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 2, 1 };
        int target = 4;

        System.out.println(checkTwoSum(arr, target));
    }
}
