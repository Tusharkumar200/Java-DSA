package MyHashMap;

import java.util.*;


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

     @SuppressWarnings("unchecked")
    public myHashMap(){
        this.list = new LinkedList[5];

    }

    public boolean put(int key, String value){
        int index = hashKey(key);
       
        if(list[index] == null){
            list[index]= new LinkedList<>();
        }

        LinkedList<Entry> bucket = list[index];

        for(var entry:bucket){
            if(entry.key ==key){
                entry.value = value;
                return true;
            }
        }
        bucket.addLast(new Entry(key, value));
        return true;
    }

    public String remove (int key){
        int index = hashKey(key);
        if(list[index] == null){
            throw new IllegalStateException();
        }
        var bucket = list[index];

        for(var entry:bucket){
            if(entry.key == key){
                bucket.remove(entry);
                return entry.value;
            }
        }
        throw new IllegalStateException();
    }

    public String get(int key){
        int index = hashKey(key);
        var bucket = list[index];
      if(list[index] == null){
        throw new IllegalStateException();
      }
        for (var entry : bucket){
            if(entry.key == key){
                return entry.value;
            }
        }
        throw new Exception();
    }

    private int hashKey(int key){
        return key % list.length;
    }

    public String toString(){
        return Arrays.toString(list);
    }
}
