package challenge;

public class TestingTrafficColor extends Thread{
  public static void main(String[] args) throws InterruptedException {
    TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
    TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);
    TrafficLightThread Green = new TrafficLightThread(TrafficColor.GREEN);

    red.start();
    red.join();
    yellow.start();
    yellow.join();
    Green.start();
  }
}

class TrafficLightThread extends Thread {
  private TrafficColor color;

  public TrafficLightThread(TrafficColor color) {
    this.color = color;
  }

  // Rest of the class implementation...
}
