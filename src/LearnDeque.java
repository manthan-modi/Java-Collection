import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String args[]) {
       ArrayDeque<Integer> dq = new ArrayDeque<>();
       dq.offer(5);
       dq.offerFirst(3);
       dq.offerLast(5);
       dq.offerLast(5);

       dq.peek();
       dq.peekFirst();
       dq.peekLast();

       dq.poll();
       dq.pollFirst();
       dq.pollLast();
    }
}
