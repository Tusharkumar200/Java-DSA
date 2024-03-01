package challenge1.src.utlity;

import challenge1.src.geomatry.*;


public class Calculator{
  public static void main(String[] args) {
    Circle cir = new Circle(5);
    Rectangle rect = new Rectangle(10,5);

    double cirArea = Math.round(Math.PI * Math.pow(cir.radius,2));
    double rectArea = rect.breadth * rect.length;

    System.out.printf("Area of the circle is : %s ,\n  Area of Rectangle : %s",cirArea,rectArea);

  }
}