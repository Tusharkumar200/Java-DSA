package challenge;

public class TestingPrintThreads {
  public static void main(String[] args) throws InterruptedException {
    printThreads t1 = new printThreads(1);
    printThreads t2 = new printThreads(2);
    printThreads t3 = new printThreads(3);

    t1.start();
    t1.join();
    t2.start();
    t2.join();
    
    t3.start();
  }
}
