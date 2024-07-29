import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // The Offer functionality is used to insert values inside a queue
        queue.offer(24);
        queue.offer(25);
        queue.offer(36);
        // The Pool functionality is used to remove a Element in Linklist;
        System.out.println(queue.poll());
    }
}
