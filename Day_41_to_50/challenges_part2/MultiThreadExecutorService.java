package challenges_part2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

public class MultiThreadExecutorService {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 10; i++) {
      SleepTask task = new SleepTask();
      service.submit((Runnable) task); // Fix: Cast SleepTask to Runnable
    }
    try {
      if(!service.awaitTermination(10, TimeUnit.SECONDS)){
        System.out.println("Emergency shutdown");
        service.shutdownNow();
      }
    } catch (Error e) {
      
      throw new RuntimeErrorException(e);
    }
  }
}
