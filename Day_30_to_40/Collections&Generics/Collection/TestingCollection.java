package Collection;

import java.util.*;

public class TestingCollection {
  public static void main(String[] args) {
    List<Integer> numList = new ArrayList<>();
    numList.add(-45);
    numList.add(5);
    numList.add(4);
    numList.add(15);
    numList.add(45);
    Utility.print(numList);
    Collections.sort(numList);
    Collections.reverse(numList);
    Utility.print(numList);

    List<Integer> unmodifiable = Collections.unmodifiableList(numList);
    // unmodifiable.add(344);

  }
}
