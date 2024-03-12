package enums;

public enum TrafficLight {
  RED("Stop"),GREEN("Go"),YELLOW("Caution");

  private final String action;

  private TrafficLight(String action) {
    this.action = action;
  }

  
}
