import java.util.*;

public class FindMaxKey {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 15);
        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}
