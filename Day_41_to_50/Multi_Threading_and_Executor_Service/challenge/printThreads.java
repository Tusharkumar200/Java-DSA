package challenge;

public class printThreads extends Thread {
  private final int threadNumber;

  printThreads(int threadNumber){
      this.threadNumber = threadNumber;

  }
  public void run(){
    
      System.out.printf("\n %s thread starting: %d",Thread.currentThread().getName(),threadNumber);    

      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      
      }

      System.out.printf("\n %s thread Ended... %d",Thread.currentThread().getName(),threadNumber);      
    
  }
}

  

