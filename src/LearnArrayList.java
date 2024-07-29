import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class LearnArrayList {
    public static void main(String[] args) {
       String [] studentName = new String[31];
        studentName[29] = "Hello Manthan";
        // studentName[32] = "Gives Array Out Of Bound Exception";
        // To Solve this issue lets use a ArrayList container;
        ArrayList<String> students = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        students.add("Manthan");
        // Inserting at a specific location using ArrayList;
        list.add(3, 150);
        System.out.println(list.get(3));
        list.remove(2);
        list.clear();
        list.set(0, 100);
        // returns a true if the value is present in a List
        list.contains(100);
        System.out.println(list.size());

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}