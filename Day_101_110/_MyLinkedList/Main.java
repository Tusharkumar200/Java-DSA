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

    System.out.println(list.sum());

  }
}
