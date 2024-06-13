import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Tushar");
        map.put(2,"Kanish");
        map.put(3,"Anish");
        map.put(4,"Sachin");
        map.put(5,"Mohit");

        System.out.println(map);
        System.out.println(map.get(2));

    }
}