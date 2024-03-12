import java.util.HashMap;
import java.util.Map;

class TestingMap{
  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    map.put("Tushar" , 87);
    map.put("Ankit" ,54 );
    map.put("Ram" ,89 );
    map.put("shyam" ,75 );
    map.put("prashant" ,82 );
    map.put("mohit" ,45 );
    System.out.println(map.size());
    System.out.println(map.get("Tushar"));

    for(String key: map.keySet()){
      System.out.printf("%s : %s ",key,map.get(key));
    }
  }
}