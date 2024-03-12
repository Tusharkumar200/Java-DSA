package enums;

public class TestingEnums {
  public static void main(String[] args) {
    TrafficLight color = TrafficLight.GREEN;
    Grade G = Grade.A;
    System.out.println(color);
    System.out.println(G);

    Grade grade  = Grade.valueOf("D");
    for(Grade value : Grade.values()){
      System.out.println(value);
    }
  }
}
