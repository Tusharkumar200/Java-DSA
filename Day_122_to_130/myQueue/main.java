package myQueue;

public class main {
    public static void main(String[] args) {
        My_queue q = new My_queue(5);
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.toString());
    }
}
