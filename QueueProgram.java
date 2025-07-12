import java.util.LinkedList;
import java.util.Queue;
public class QueueProgram {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.offer(15);
        q.offer(17);
        q.offer(20);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
    }
}
