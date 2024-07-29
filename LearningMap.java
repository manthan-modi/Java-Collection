import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class LearningMap {
    public static void main(String args[]) {
        Map<String, Integer> mp = new HashMap<>();
        Map<String, Integer> map = new TreeMap<>();
        // Works on the idea of Key Pair value
        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
        if (!mp.containsKey("two")) {
            mp.put("Two", 23);
        }
        mp.putIfAbsent("Four", 4);

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : mp.keySet()) {
            System.out.println(key);
        }
        for (Integer values : mp.values()) {
            System.out.println(values);
        }
        mp.remove("One");
    }
}
