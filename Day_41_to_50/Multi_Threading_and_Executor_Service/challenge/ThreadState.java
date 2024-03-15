package challenge;

public class ThreadState extends Thread {
  public void run(){
    try{
      Thread.sleep(5000);
      System.out.printf("\nfrom inside run %s",getState());
    }catch(InterruptedException e){
      throw new RuntimeException(e);
    }
  }
}
