package Collection;

import java.util.*;

public class TestingSet {
  public static void main(String[] args) {
    Set<String> name = new HashSet<>();
    System.out.println(name.add("Kumar "));
    System.out.println(name.add("Tushar "));
    System.out.println(name.add("codexspot "));

    Utility.print(name);
    System.out.println(name.remove("codexspot"));
    System.out.println(name.size());
    Utility.print(name);
  }
}
