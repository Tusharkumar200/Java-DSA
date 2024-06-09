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

    public boolean pushRear(int x){
        if(isFull()) return false;
        items[rear] = x;
        rear = (rear+1)%size;
        count++;
    }

    public boolean isEmpty(){
        return count == 0;
    }
    
    public boolean isFull(){
        return count == size;
    }


}