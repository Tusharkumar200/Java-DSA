package executor;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String>{
  private String name;

  public FetchName(String name){
    this.name = name;
  }

  public String call() throws Exception{
    Thread.sleep(4000);
    System.out.printf("Getting %s form server",name);
    return name+ " Kumar ";
  }
}
