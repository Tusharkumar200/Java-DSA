

public class MaxHeap{
    private int[] items;
    private int size;

    public MaxHeap(int size){
        this.items = new int[size];
        this.size = 0;
    }

    public void insert(int value){
        // Insert element at available slot
        items[size] = value;
        size++;

        // Bubble up
        int index = size - 1;  
        while(index >0 &&items[index] > getParent(index)){
            swapElementWithIndex(index, getParentIndex(index));
            index = getParentIndex(index);

        }
    }

    private int getParentIndex(int index){
        return (index - 1) / 2;
    }

    private int getParent(int index){
        return items[getParentIndex(index)];
    }

    private void swapElementWithIndex(int idx1 , int idx2){
        int temp = items[idx1];
        items[idx1] = items[idx2];
        items[idx2] = temp;
    }
}
