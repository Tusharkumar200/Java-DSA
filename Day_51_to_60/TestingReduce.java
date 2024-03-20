import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(5, 1, 8, 9,5,8,7,3,4,6);

    int sum = 0;
    for(Integer number : numbers){
      sum += number;
    }
    System.out.println("normal method: "+sum);

    int newSum = numbers.stream().reduce(0, new BinaryOperator<Integer>(){
      public Integer apply(Integer integer,Integer integer2){
              return integer + integer2;
      }
    });
    System.out.println("sum is: "+newSum);

    int newSum2 = numbers.stream()
    .reduce(0,(a,b)-> a+b);
    System.out.println("sum using lambda :"+newSum2);

    int max = numbers.stream()
    .reduce(Integer.MIN_VALUE,(a,b)-> a>b?a:b);
    System.out.println("max using lambda :"+max);
  }
}
