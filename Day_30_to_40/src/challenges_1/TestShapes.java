package src.challenges_1;

public class TestShapes {
  public static void main(String[] args) {
   Circle circle = new Circle(5);
   Square square = new Square(10.5);

   System.out.printf("Area of circle %f",circle.calculateArea());
   System.out.printf("Area of square %f",square.calculateArea());
  }
}
