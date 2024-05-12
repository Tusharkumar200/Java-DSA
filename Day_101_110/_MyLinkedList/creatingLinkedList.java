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

    if(head == null){
      head =tail = node;
    }
    else{
        tail.next = node;
        tail = node;

    }
    
  }

  public String toString(){
    Node current = head;
    StringBuilder result = new StringBuilder();

    while(current != null){
      result.append(current.data);
      if(current.next != null){
        result.append("--> ");
      }
      
      current = current.next;
    }

    return result.toString();
  }
  
}