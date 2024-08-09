import java.util.LinkedList;
import java.util.Queue;

public class LinedListQueueJava {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();

        que.offer(30);
        que.offer(10);
        que.offer(40);
        que.offer(20);

        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.peek());


    }
}
