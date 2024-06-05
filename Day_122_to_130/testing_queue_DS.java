import java.util.Queue;
import java.util.ArrayDeque;

class testing_queue_DS{
    public static void main(String[] args) {
        Queue <Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.offer(60);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
       
        System.out.println("Queue: " + queue);
        
    }
}