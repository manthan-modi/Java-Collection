import java.util.LinkedList;
import java.util.PriorityQueue;

public class LearningPriorityQueue {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(30);
        pq.offer(20);
        System.out.println(pq);
        pq.poll();
    }
}
