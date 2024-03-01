public class Car extends Vehicle{
  
  private int noOfDoors;

  public Car(){
    super(4);
  }

  public void makeStartSound(){
    System.out.println("Vroom....");
  }
}
