package challenges_part2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadService {
  public static void main(String[] args) {
    try(ExecutorService service = Executors.newSingleThreadExecutor()){
        printNumbers task = new printNumbers();
        service.submit(task);
    }
  }
}
