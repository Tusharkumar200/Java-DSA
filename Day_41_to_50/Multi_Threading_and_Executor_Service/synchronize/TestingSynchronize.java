public class TestingSynchronize {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Counter counter = new Counter();
    UpdaterThread t1 = new UpdaterThread(counter);
    UpdaterThread t2 = new UpdaterThread(counter);

    try{
      t1.start();
      t2.start();
      
      t1.join();
      t2.join();
    }catch(InterruptedException e){
      System.out.println("Thread Interupted"+ e.getMessage());
    }
    long end = System.currentTimeMillis();
    System.out.printf("Final count value: %d and time take: %d",counter.getCount(),(end -start));
  }
}
