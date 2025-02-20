import java.util.*;

public class MergeTwoMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        HashMap<String, Integer> merged = new HashMap<>();
        for (String key : map1.keySet())
            merged.put(key, map1.get(key));
        for (String key : map2.keySet()) {
            if (merged.containsKey(key))
                merged.put(key, merged.get(key) + map2.get(key));
            else
                merged.put(key, map2.get(key));
        }
        System.out.println(merged);
    }
}
