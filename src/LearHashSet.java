import java.util.HashSet;
import java.util.Set;
public class LearHashSet {
    public static void main(String args[]) {
        Set <Integer> set = new HashSet<>();
        set.add(32);
        set.add(54);
        set.add(21);
        set.add(21);
        System.out.println(set);
        set.remove(21);
        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        set.clear();
    }
}
