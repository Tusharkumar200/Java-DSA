package Challenge;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Frequency {
  public static void main(String[] args) {
    List <Integer>strList = new ArrayList<>();
    strList.add(1);
    strList.add(5);
    strList.add(19);
    strList.add(19);
    strList.add(19);
    strList.add(19);
    strList.add(4);
    strList.add(78);
    // frequency means dublicate element
    System.out.println(Collections.frequency(strList,19));
  }
}
