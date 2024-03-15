package sleep;

public class TestingSleep {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Task1 completed...");
    Thread.sleep(3000);
    System.out.println("Task2 completed...");
    Thread.sleep(3000);
    System.out.println("Task3 completed...");
    System.out.println("work done.");
  }
}
