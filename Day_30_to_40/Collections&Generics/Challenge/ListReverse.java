package Challenge;

import java.util.*;

public class ListReverse {
  public static void main(String[] args) {
    List <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(6);
    list.add(4);
    list.add(5);
    System.out.println(list);
    reverse(list);
    System.out.println(list);
  }

  public static void reverse(List <Integer> list){
    // Collections.reverse(list);

    for (int i = 0; i < list.size() /2; i++) {
      ListSwapping.swap(list, i, list.size() -1 -i);
    }
  }
}
