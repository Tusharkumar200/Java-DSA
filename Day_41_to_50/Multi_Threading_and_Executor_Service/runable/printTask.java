package runable;
public class printTask implements Runnable {
  public void run(){
    // print task
    for(int i=1;i<=1000;i++){
      System.out.printf("%d %c ",i,targetChar);
    } 
    System.out.printf("\n %s %c task complete",Thread.currentThread().getName(),targetChar);
  }
    private final char targetChar;

    public printTask(char targetChar) {
      this.targetChar = targetChar;
    }
  
}
