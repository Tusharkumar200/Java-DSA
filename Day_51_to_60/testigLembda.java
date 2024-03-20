
class testingLembda{
  public static void main(String[] args) {
    testingLembda test = new testingLembda();
    int sum = test.sum(9,8);
    test.printString("Hello tushar is working...");
    System.out.println(sum);
    

// lembda function
    // toPrint -> System.out.println(toPrint);
    // (a,b) -> a+b;
    // (a,b) -> {
    //   int sum = a+b;
    //   System.out.println(sum);
    // }

    
  }
  private void printString(String toPrint){
    System.out.println(toPrint);
  }
  private int sum(int a, int b){
    int sum = a+b;
    return sum;
  }
}