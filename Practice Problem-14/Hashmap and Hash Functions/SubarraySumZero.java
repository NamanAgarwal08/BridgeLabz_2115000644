import java.util.*;

public class SubarraySumZero {
    
    public static int countSubarray(int arr[]) {
        int ans = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (map.containsKey(preSum)) {
                ans += map.get(preSum);
                map.put(preSum, map.get(preSum) + 1);
            } else {
                map.put(preSum, 1);
            }
        }

        return ans;

    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 3, -2, -3, 4, 5, -2, -7 };
        //            1  3   2  5   3   0  4  9   7   0
        System.out.println(countSubarray(arr));
    }
}
