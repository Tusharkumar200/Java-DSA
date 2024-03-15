package challenge;

public class TestingThreadState {
  public static void main(String[] args) throws InterruptedException {
    ThreadState t1 = new ThreadState();
    System.out.printf("\ncreated the threads  %s",t1.getState());
    t1.start();
    t1.join();
    System.out.printf("\nthreads finished  %s",t1.getState());
  }
}
