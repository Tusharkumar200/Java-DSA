import runable.printTask;

public class TestingPriority {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    printTask p1 = new printTask('*');
    printTask p2 = new printTask('#');
    printTask p3 = new printTask('$');

    Thread t1 = new Thread(p1);
    t1.setPriority(Thread.MIN_PRIORITY); // THIS IS NOT GURRENTED ORDER OF EXCUCTION
    t1.start();

    Thread t2 = new Thread(p2);
    t2.setPriority(Thread.NORM_PRIORITY);
    t2.start();
    Thread t3 = new Thread(p3);
    t3.setPriority(Thread.MAX_PRIORITY);
    t3.start();

    long endTime = System.currentTimeMillis();
    System.out.printf("totla time: %d",endTime-startTime);
    System.out.printf("\n %s* task complete",Thread.currentThread().getName());
  }
}
