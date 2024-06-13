package Leedcode;

// question no 622
// Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".

// question link: https://leetcode.com/problems/design-circular-queue/

public class CircularQueue {
    
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;

    public CircularQueue(int k) {

        this.items = new int[k];
        this.front = -1;
        this.rear = 0;
        this.count = 0;
        this.size = k;
    }

    public boolean enQueue(int value) {

        if( isFull() ){
            return false;
        }

        items[rear] = value;
        rear = (rear+1)%size;
        count++;
        return true;
        
    }
    public boolean deQueue() {
        if( isEmpty() ) return false;
        front = (front+1)%size;
        count--;
        return true;
    }

    public int Front() {
        if( isEmpty() ) return -1;
        return items[(front+1)%size];
    }
    
    public int Rear() {
        if( isEmpty() ) return -1;

        int lastIndex = rear - 1;
        if(lastIndex == -1) lastIndex = size - 1;
        return items[lastIndex];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count  == size;
    }

}
