package myQueue;

import java.util.Arrays;

public class My_queue {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;

    public My_queue(int capacity) {
        
        this.items = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.count = 0;
        this.size = capacity;
    }

    public void enqueue(int val) {
        if(count == size){
            System.out.println("Queue is full");
            return;
        }
        items[rear] = val;
        rear = (rear+1)%size;
        count++;  
    
    }
    public int dequeue() {

        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        front = (front+1)%size;
        int value = items[front];
        items[front] = 0;
        count--;
        return value;
    
    }


    public String toString(){
       return Arrays.toString(items);
    }
}
