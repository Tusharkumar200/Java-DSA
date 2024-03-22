package challenges_3;
import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
      List <Integer> numbers = List.of(1,1,2,3,3,4,5,5,6);
      List<Integer> distinctNumbers = numbers.stream()
                  .distinct()
                  .collect(Collectors.toList());
      System.out.println(distinctNumbers);
    }
}
