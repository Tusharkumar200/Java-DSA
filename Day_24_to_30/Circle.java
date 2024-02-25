import java.util.Scanner;

public class Circle {

  double radiusInMm;
  
  Circle(double radiusInMm){
    this.radiusInMm = radiusInMm;
  }

  double getCircumference(){
      return 2*radiusInMm * Math.PI;
  }
  double getArea(){
      return Math.PI * Math.pow(radiusInMm,2);
  }
  public String toString(){

    return "Circle props: Radius in mm:" +radiusInMm + ", Circumference in mm:" +getCircumference()+ ", Area in mm2:"+getArea();
  }
  public static void main(String[] args) {
   try (Scanner input = new Scanner(System.in)) {
    System.out.println("WElCOME TO THE WORLD OF CIRCLE ");
     System.out.print("Please Enter Radius of a circle :");
     double radius = input.nextDouble();
    
     Circle circle = new Circle(radius);
     System.out.println(circle);
  }

  }
}
