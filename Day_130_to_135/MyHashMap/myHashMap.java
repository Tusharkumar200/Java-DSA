package MyHashMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.AbstractList; // Add this import statement

class Entry{
    public int key;
    public String value;

     Entry(int key, String value){

        this.key = key;
        this.value = value;
    }

    public String toString(){
        return  key + "= " + value ;
    }
}

public class myHashMap {
    LinkedList <Entry>[] list;

     public myHashMap(){
        this.list = new LinkedList[5];

    }

    public boolean put(int key, String value){
        int index = hashKey(key);
       
        if(list[index] == null){
            list[index]= new LinkedList<>();
        }
        var bucket = list[index];
        bucket.addLast(new Entry(key, value));
        return true;
    }

    private int hashKey(int key){
        return key % list.length;
    }

    public String toString(){
        return Arrays.toString(list);
    }
}
