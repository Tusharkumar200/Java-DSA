package challenge;

public class HelloThreads extends Thread {
  private final int threadNumber;

  HelloThreads(int threadNumber){
      this.threadNumber = threadNumber;

  }
  public void run(){
    for (int i = 1; i <=10; i++) {
      System.out.printf("\nhello from thread %d",threadNumber);      
    }
  }
}
