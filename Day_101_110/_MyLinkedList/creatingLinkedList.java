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

  public creatingLinkedList(){
    head = null;
  }
  
  public void insert(int value){
    Node node = new Node(value);

    if(head == null){
      head = node;
    }
    else{
        Node current = head;

        while(current.next != null){
          current = current.next;
        }
        current.next = node;
    }
    
  }
  
}