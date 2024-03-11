package Challenge;

import java.util.*;

public class Comparator {
  public static void main(String[] args) {
    List<String> list = new ArrayList <> ();
    list.add("Bear");
    list.add("Zebra");
    list.add("Lion");
    list.add("Ant");

    System.out.println(list);
    sortInDescending(list);
    System.out.println(list);
  }

  public static void sortInDescending(List <String> stringList){
      // Collections.sort(stringList);
      // Collections.reverse(stringList);

     Collections.sort(stringList, new java.util.Comparator<String>() {
      public int compare(String s, String t){
        if(s.equals(t)){
          return 0;
        }
        else if(s.charAt(0) < t.charAt(0)){
          return 1;
        }
        else{
          return -1;
        }
      }
     });

  }
}
