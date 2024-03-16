package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multithread {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 10; i++) {
      
      printTask task1  = new printTask('*');
  
      service.submit(task1);
    }
    service.shutdown();
    System.out.println("\n****************1");
    if(service.awaitTermination(10, TimeUnit.SECONDS)){
      System.out.println("\n****************2");
      service.shutdownNow();
    }
  }
}
