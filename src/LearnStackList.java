import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LearnStackList {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Pig");
        animals.push("Cow");
        animals.push("Cat");
        animals.push("Rat");
        // Retures the Top Element in animals;
        System.out.println(animals.peek());        
    }
}
