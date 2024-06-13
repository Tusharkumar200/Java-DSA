package myQueue;

public class Main {
    public static void main(String[] args) {
        My_queue q = new My_queue(6);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        q.dequeue();
        q.dequeue();

        q.enqueue(7);
        q.enqueue(8);

        q.dequeue();
               
        System.out.println(q);
    }
}
