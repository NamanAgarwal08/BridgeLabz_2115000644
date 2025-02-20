import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 1);
        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (!inverted.containsKey(value))
                inverted.put(value, new ArrayList<>());
            inverted.get(value).add(key);
        }
        System.out.println(inverted);
    }
}
