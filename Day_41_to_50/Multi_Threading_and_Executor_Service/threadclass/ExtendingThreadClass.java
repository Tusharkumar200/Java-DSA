package threadclass;
public class ExtendingThreadClass {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    firstTask t1 = new firstTask();
    secondTask t2 = new secondTask();
    ThirdTask t3 = new ThirdTask();
    System.out.println("Staring task1");
    t1.start();
    System.out.println("Staring task2");
    t2.start();
    System.out.println("Staring task3");
    t3.start();

    long endTime = System.currentTimeMillis();
    System.out.printf("totla time: %d",endTime-startTime);
    System.out.printf("\n %s* task complete",Thread.currentThread().getName());
  }
}
