package Leedcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Interleave_The_First_Half_Of_The_Queue_With_The_Second_Half {
    
    public static void interLeaveQueue(Queue<Integer> q){
        int size = q.size();
        Queue<Integer> newQueue  = new ArrayDeque<>();

        for(int i = 0; i < size/2; i++){
            newQueue.offer(q.poll());
        }

        while(!newQueue.isEmpty()){
            q.offer(newQueue.poll());
            q.offer(q.poll());
        }
    }
}
