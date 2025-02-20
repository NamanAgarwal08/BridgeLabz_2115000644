import java.util.*;

public class Frequency {
    
    public static void displayFreq(HashMap<String, Integer> map) {
        for (String str : map.keySet()) {
            System.out.println(str + " -> " + map.get(str));
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        List<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("banana");
        lst.add("apple");
        lst.add("orange");

        for (int i = 0; i < lst.size(); i++) {
            String str = lst.get(i);
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        displayFreq(map);
    }

}
