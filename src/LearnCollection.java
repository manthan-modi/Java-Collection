import java.util.*;
public class LearnCollection {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(23);
        list.add(25);
        list.add(29);   
        list.add(24);
        list.add(34);
        list.add(23);
        System.out.println(Collections.min(list));
        Collections.sort(list);
    }
}
