package challenges;

import java.util.List;


public class OddEven {
  public static void main(String[] args) {
    List <Integer> numbers = List.of(1,23,3,4,5,6,7,89,9,10);

     numbers.stream()
          .filter(nums -> nums %2 ==1);
          .for (num -> System.out.print(num));
  }
}
