package challenge;

public class TestingHelloThreads {
  public static void main(String[] args) {
    HelloThreads t1 = new HelloThreads(1);
    HelloThreads t2 = new HelloThreads(2);
    t1.start();
    t2.start();
  }
}
