package MyHashMap;

import java.util.LinkedList;

class Entry{
    public int key;
    public String value;

     Entry(int key, String value){
        this.key = key;
        this.value = value;
    }
}

public class myHashMap {
    LinkedList <Entry>[] list;

    public myHashMap(){
        this.list = new LinkedList[5];

    }

    public boolean put(int key, String value){
        int index = hashKey(key);
        var bucket = list[index];
        if(bucket == null){
            list[index]= new LinkedList<>();
        }
        bucket.addLast(new Entry(key, value));
        return true;
    }

    private int hashKey(int key){
        return key % list.length;
    }


}
