package polymorphism;

public class TestTranspotation {
  public static void main(String[] args) {
    Car c = new Car();
    Vehicle v = new Vehicle();
    Vehicle vcar = new Car();

    // castTest(v);
    castTest(c);
    c.start();
    v.start();
  }

  private static void castTest(Vehicle veh){
      // veh.start();
      Car cVehicle = (Car) veh;

      cVehicle.start();
      // cVehicle.noOfDoors();
  }

}
