package myQueue;

import java.util.Arrays;

public class myPriorityQueue {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;

    public myPriorityQueue(int capacity) {
        
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
        // [1,2,i,4,5] --> insert 3

        int i; // Declare the variable 'i' before the for loop
        for(i = rear; i>0;i--){
            if(items[i-1] <= val){
                break;
            };
        
            if(items[i -1] >val){
                // shift the items
                items[i] = items[i-1];
        
            }
        }
        items[i] = val;
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
