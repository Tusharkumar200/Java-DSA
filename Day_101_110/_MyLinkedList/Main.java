package _MyLinkedList;

public class Main {
  
  public static void main(String[] args) {
    creatingLinkedList  list = new creatingLinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    list.insert(60);
    

    list.insertFirst(5);
    list.insertFirst(2);
    list.insertAt(2,35);
    
    
    System.out.println(list);
    
    System.out.println(list.sum());
    System.out.println(list.isEmpty());
    System.out.println(list.indexOf(30));

  }
}