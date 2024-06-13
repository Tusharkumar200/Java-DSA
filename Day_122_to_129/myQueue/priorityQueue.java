package myQueue;

import java.util.Queue;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(15);
        queue.add(5);
        queue.add(25);

        System.out.println(queue);
        
        while(!queue.isEmpty()){
            
            System.out.println(queue.poll());
        }

    }
}
