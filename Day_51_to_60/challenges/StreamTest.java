package challenges;

import java.util.*;

public class StreamTest {
  public static void main(String[] args) {
    List<String> names = List.of("Tushar","Aman","Harsh");
    names.stream()
            .forEach(name -> System.out.println(name));
              
  }
}
