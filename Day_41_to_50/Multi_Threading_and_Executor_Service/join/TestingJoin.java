package join;
import runable.*;
public class TestingJoin {
  public static void main(String[] args) throws InterruptedException {
    long startTime = System.currentTimeMillis();

    printTask p1 = new printTask('*');
    printTask p2 = new printTask('#');
    printTask p3 = new printTask('$');

    Thread t1 = new Thread(p1);
    t1.start();
    System.out.println("\n Thread 3 started");
    Thread t2 = new Thread(p2);
    t2.start();
    System.out.println("\n Thread 3 started");
    t1.join();   //     it's allow to let first complete the above task then execute other task
    Thread t3 = new Thread(p3);
    t3.start();
    System.out.println("\n Thread 3 started");

    long endTime = System.currentTimeMillis();
    System.out.printf("totla time: %d",endTime-startTime);
    System.out.printf("\n %s* task complete",Thread.currentThread().getName());
  }
}
