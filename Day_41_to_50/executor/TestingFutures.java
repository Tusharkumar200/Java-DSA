package executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newFixedThreadPool(3);
    FetchName task1 = new FetchName("Tushar");
    FetchName task2 = new FetchName("Sachin");
    FetchName task3 = new FetchName("Harsh");
    FetchName task4 = new FetchName("Mohit");
    
    Future<String> name1 = service.submit(task1);
    Future<String> name2 = service.submit(task2);
    Future<String> name3 = service.submit(task3);
    Future<String> name4 = service.submit(task4);

    System.out.printf("full name is %s",name1.get());
    System.out.printf("full name is %s",name2.get());
    System.out.printf("full name is %s",name3.get());
    System.out.printf("full name is %s",name4.get());
    
    service.shutdown();
  }
}
