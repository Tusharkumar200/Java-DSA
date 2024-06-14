package MyHashMap;

public class Main{

    public static void main(String[] args) {
        myHashMap map = new myHashMap();
        map.put(1, "tushar");
        map.put(2, "kumar");
        map.put(3, "singh");
        map.put(7, "tushar singh");

        System.out.println(map.get(1));
        
    }
}