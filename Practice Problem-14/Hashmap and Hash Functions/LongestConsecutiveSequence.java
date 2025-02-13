// import java.util.*;

// public class LongestConsecutiveSequence {
//     public static void main(String[] args) {
//         // int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
//         int arr[] = { 2, 6, 1, 9, 4, 5, 3 };

//         HashMap<Integer, Node> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {

//             if (map.containsKey(arr[i] - 1) && map.containsKey(arr[i] + 1)) {
//                 int min1 = map.get(arr[i] - 1).min;
//                 // int max1 = map.get(arr[i] - 1).max;
//                 // int min2 = map.get(arr[i] + 1).min;
//                 int max2 = map.get(arr[i] + 1).max;
//                 map.put(arr[i], new Node(min1, max2));

//                 map.get(arr[i] - 1).max = max2;
//                 map.get(arr[i] + 1).min = min1;
//             } else if (map.containsKey(arr[i] - 1)) {
//                 int min1 = map.get(arr[i] - 1).min;
//                 map.put(arr[i], new Node(min1, arr[i]));
//                 map.get(arr[i] - 1).max = arr[i];
//             } else if (map.containsKey(arr[i] + 1)) {
//                 int max2 = map.get(arr[i] + 1).max;
//                 map.put(arr[i], new Node(arr[i], max2));
//                 map.get(arr[i] + 1).min = arr[i];
//             } else {
//                 map.put(arr[i], new Node(arr[i], arr[i]));
//             }
//         }
        
//         int ans = Integer.MIN_VALUE;
//         for (int x : map.keySet()) {
//             int diff = map.get(x).max - map.get(x).min + 1;
//             if (ans < diff) {
//                 ans = diff;
//             }
//         }
//         System.out.println(ans);
//     }

//     static class Node {
//         int min;
//         int max;

//         Node(int min, int max) {
//             this.min = min;
//             this.max = max;
//         }
//     }
// }


import java.util.*;

public class LongestConsecutiveSequence {
    
    
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - 1)) {
                map.put(nums[i], false);
            } else {
                map.put(nums[i], true);
            }
            if (map.containsKey(nums[i] + 1)) {
                map.put(nums[i] + 1, false);
            }
        }
        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key)) {
                int count = 0;
                while (map.containsKey(key)) {
                    count++;
                    key++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int arr[] = { 2, 6, 1, 9, 4, 5, 3 };

        System.out.println(longestConsecutive(arr));
    }
    
}