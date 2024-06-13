package myQueue;

public class testing_priorityQueue{

    public static void main(String[] args) {
        
        myPriorityQueue pq = new myPriorityQueue(5);
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(4);
        pq.enqueue(5);
    
        System.out.println(pq.dequeue());
    }
}
