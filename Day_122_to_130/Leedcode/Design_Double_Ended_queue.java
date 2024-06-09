package Leedcode;

public class Design_Double_Ended_queue{
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;

    public Design_Double_Ended_queue(int n) {

        items = new int[n];
        front = 0;
        rear = 0;
        count = 0;
        size = n;
        
    }

    public boolean pushFront(int x){
        if(isFull()) return false;
        front--;
        if(front == -1)
           front = size - 1;
        items[front] = x;
        count++;
        return true;
    } 
    public int popFront(){
        if(isEmpty()) return -1;
        int value = items[front];
        front = (front+1)%size;
        count--;
        return value;
    }
    public boolean pushRear(int x){
        if(isFull()) return false;
        items[rear] = x;
        rear = (rear+1)%size;
        count++;
        return true;
    }

    public int popRear(){
       if(isEmpty()) return -1;
       rear--;
         if(rear == -1)
              rear = size - 1;
        
        return items[rear];
    
    }

    public int getFront(){
        if(isEmpty()) return -1;
        return items[front];
    }

    public int getRear(){
        if(isEmpty()) return -1;
        int lastIndex = rear - 1;
        if(lastIndex == -1) lastIndex = size - 1;
        return items[lastIndex];
    } 

    public boolean isEmpty(){
        return count == 0;
    }
    
    public boolean isFull(){
        return count == size;
    }


}