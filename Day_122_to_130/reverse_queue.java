import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {

    
        public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
        System.out.println("Queue: " + queue);
        // reverse the queue
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.print(queue + " ");
        
        
       }
}
