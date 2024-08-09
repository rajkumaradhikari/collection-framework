import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueJava {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(55);
        pq.offer(9);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
