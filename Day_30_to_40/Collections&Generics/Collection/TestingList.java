package Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
  public static void main(String[] args) {
    
    List <String>strList = new ArrayList<>();
    // List strList = new ArrayList(); --> to store any type of data

    strList.add("Tushar ");
    strList.add("Kumar ");
    System.out.println(strList);

    // strList.remove(1);
    
    for(int i=0; i<strList.size(); i++){
      System.out.println(strList.get(i));
    }
    System.out.println();
    for(String name:strList){
      System.out.println(name);
    }
  }
}
