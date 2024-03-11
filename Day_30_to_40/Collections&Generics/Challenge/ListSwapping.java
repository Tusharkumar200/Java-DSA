package Challenge;

import java.util.ArrayList;
import java.util.List;

public class ListSwapping {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(8);
    list.add(5);
    list.add(9);
    list.add(10);
    System.out.println(list);
    swap(list,1,3);
    System.out.println(list);
  }
    public static void swap(List<Integer> list,int x,int y){
      int swap = list.get(x);
      list.set(x,list.get(y));
      list.set(y,swap);
    }
  }

