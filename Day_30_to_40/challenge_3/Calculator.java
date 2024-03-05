package challenge_3;

public class Calculator {
  public int add(int a, int b){
    return a + b;
  }
  public int add(int a, int b, int c){
    return a + b +c;
  }

  public double add(double a, double b){
    return a + b;
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.add(10,20));
    System.out.println(calculator.add(10,20,30));
    System.out.println(calculator.add(45.555,84.5451));
    
    
  }
}
