package Collection;

import java.util.*;

public class TestingQueue {
  public static void main(String[] args) {
    Queue <Integer> queue = new LinkedList<>();
     queue.add(1);
     queue.offer(2);
     queue.offer(3);
     queue.offer(4);
     queue.offer(5);
    //  queue.poll();
   
     Utility.print(queue);
     System.out.println(queue.remove());
     Utility.print(queue);
  }
}
