package executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singlethread {
  public static void main(String[] args) {
    ExecutorService service = Executors.newSingleThreadExecutor();
    printTask task1  = new              printTask('*');

    service.submit(task1);
    service.shutdown();
  }
}
