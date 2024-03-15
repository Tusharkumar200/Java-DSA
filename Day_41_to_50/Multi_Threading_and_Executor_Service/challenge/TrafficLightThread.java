package challenge;

public class TrafficLightThread extends Thread{
  private TrafficColor color;

  public void TestingHelloThreads(TrafficColor color){
    this.color = color;
  }

  public void run(){
    System.out.printf("%s active ",color);
    try {
      Thread.sleep(color.getOnTimeInMills());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.printf("%s Inactive ",color);
  }
}
