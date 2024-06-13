import java.util.Queue;
import java.util.ArrayDeque;


/*
 * add() - This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation.
 * offer() - This method is also used to insert an element at the tail of queue. This method is preferable to use as this method do not throw an exception if the insertion fails.offer() method returns false.
 * remove() - This method is used to remove an element from the head of queue. This method throws an exception if the queue is empty.
 * poll() - This method removes and returns the head of the queue. It returns null if the queue is empty.
 * peek() - This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
 */

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
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
       
        System.out.println("Queue: " + queue);
        
    }
}