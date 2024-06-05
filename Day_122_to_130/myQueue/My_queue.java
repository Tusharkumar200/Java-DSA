package myQueue;

import java.util.Arrays;

public class My_queue {
    private int[] items;
    private int front;
    private int rear;
    private int size;

    public My_queue(int capacity) {
        
        this.items = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = capacity;
    }

    public void enqueue(int val) {
        if(rear == size){
            System.out.println("Queue is full");
            return;
        }
        items[rear] = val;
        rear++;  
    
    }
    public int dequeue() {

        if (front+1 == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        front++;
        int value = items[front];
        items[front] = 0;
        return value;
    
    }


    public String toString(){
       return Arrays.toString(items);
    }
}
