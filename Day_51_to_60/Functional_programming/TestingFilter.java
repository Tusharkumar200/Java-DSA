import java.util.List;
import java.util.function.Consumer;

public class TestingFilter{
  public static void main(String[] args) {
    List <String> fruits= List.of("apple","banana","cherry","mango","papaya","kevy","orange");
    System.out.println(fruits.size());
    System.out.println("printing fruits normaly");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }
    // stream method -1
    System.out.println("printing fruits using // stream method -1");
    fruits.stream().forEach(new Consumer<String>(){
      public void accept(String fruit){
        System.out.println(fruit);
      }
    });

    // stream method -2
    System.out.println("printing fruits using // stream method -2");
    fruits.stream().forEach(fruit -> System.out.println(fruit));

    // filter
    System.out.println("printing fruits using filter");
    fruits.stream()
    .filter(fruit->fruit.endsWith("a"))
    .forEach(fruit -> System.out.println(fruit));

  }
}
