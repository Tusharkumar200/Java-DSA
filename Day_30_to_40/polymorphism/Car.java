package polymorphism;

public class Car extends Vehicle {
  public int noOfDoors(){
    return 5;
  }

  void start(){
    System.out.print("Starting the Car ...");
    }
}
