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

  public void removeStart(){
    if(isEmpty()) return;
    Node temp = head;
    head = head.next;
    temp.next = null;

  }

  public void removeEnd(){
    if(isEmpty()) return;
    if(head == tail){
      head = tail = null;
    }
    Node current = head;
    while(current.next != tail){
      current = current.next;
    }
    current.next = null;
    tail = current;
  }

  public void removeNthFromEndFast(int n){
    if(isEmpty()) return;
    if(head.next == null){
      head = null;
      return;
    }
    Node fast = head;
    Node current = head;
    Node prev = null;

    while(n > 1 && fast !=null){
      fast = fast.next;
      n--;
    }
    while(fast.next != null){
        prev = current;
        current = current.next;
        fast = fast.next;
    }

    prev.next = current.next;
    current.next = null;
  }
  public void removeNthFromEnd(int n){
    if(isEmpty()) return;
    if(head.next == null){
      head = null;
      return;
    }
    int totalNodes =0;
    Node current = head;

    while(current !=null){
      totalNodes++;
      current = current.next;

    }
    

    int indexFormFront = totalNodes -n+1;
    Node prev = null;
    current = head;

    while(indexFormFront > 1 && current !=null){
      prev = current;
      current = current.next;
      indexFormFront --;
    }

    if(prev == null){
      head = current.next;
      current.next = null;
      
    }

    prev.next = current.next;
    current.next = null;
  }

  public void reverse(){

    if(head == null || head.next ==null) return;
    Node prev = null;
    Node current = head;
    Node next = head.next;

    while (next != null) {
      current.next = prev;
      prev = current;
      current = next;
      next = next.next;

     
    }
    current.next = prev;
    head = current;
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