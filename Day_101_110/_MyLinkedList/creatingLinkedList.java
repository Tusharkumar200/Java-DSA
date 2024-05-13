package _MyLinkedList;

class Node{
  public int data;
  public Node next = null;

  public Node(int data){
    this.data = data;
  }

}
public class creatingLinkedList {

  private Node head;
  private Node tail;

  public creatingLinkedList(){
    head = null;
    tail = null;
  }
  
  public void insert(int value){
    Node node = new Node(value);

    if(isEmpty()){
      head =tail = node;
    }
    else{
        tail.next = node;
        tail = node;

    }
    
  }

  public void insertFirst(int value){
    Node node = new Node(value);
    if(isEmpty()){
        insert(value);
        return;
    }
    node.next = head;
    head = node;
  }

  public void insertAt(int index, int value){
    if(isEmpty()) throw new IllegalArgumentException();

    Node node = new Node(value);
    Node current = head;
    Node prev = null;

    while(index > 0 && current !=null){
      prev = current;
      current = current.next;
      index--;
    }
    prev.next = node;
    node.next = current;
  }

  public boolean isEmpty(){
    return head == null & tail == null;
  }

  public int sum(){
    Node current = head;
    int sum =0;
    while (current != null) {
      sum+= current.data;
      current = current.next;
    }
    return sum;
  }

  public int indexOf(int value){
    Node current = head;
    int index =0;
    while(current != null){
      if(current.data == value) return index;
      index++;
      current = current.next;

    }
    return -1;
  }

  public String toString(){
    Node current = head;
    StringBuilder result = new StringBuilder();

    while(current != null){
      result.append(current.data);
      if(current.next != null){
        result.append(" , ");
      }
      
      current = current.next;
    }

    return result.toString();
  }
  
}