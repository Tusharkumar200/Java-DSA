

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
    public boolean isEmpty(){
        return size == 0;
    }

    public int remove(){
        int itemToRemove  = items[0];
        items[0] = items[size - 1];
        size--;

        //Bubble down
        int index = 0;

        while(index < size && !validParent(index)){
            int indexOfLargestChild = getLargestChildIndex(index);
            swapElementWithIndex(index, indexOfLargestChild);
            index = indexOfLargestChild;
        }
        return itemToRemove;
    }

    private boolean validParent(int index){
        if(!hasLeftChild(index) && !hasRightChild(index))return true;
        if(!hasLeftChild(index)) return false;

        if(!hasRightChild(index)){
            return items[index] > getLeftChild(index);
        }
        return items[index] > getLeftChild(index) && items[index] > getRightChild(index);
    }

    private int getLargestChildIndex(int index){
        if(!hasLeftChild(index)) return index;
        if(!hasRightChild(index)) return getLeftChildIndex(index);

        if(getLeftChild(index) > getRightChild(index)){
            return getLeftChildIndex(index);
        }
        return getRightChildIndex(index);
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
     private int getLeftChildIndex(int index){
        return 2 * index + 1;
     }
     private int getRightChildIndex(int index){
        return 2 * index + 2;
     }
     private int getLeftChild(int index){
        return items[getLeftChildIndex(index) ];
     }
     private int getRightChild(int index){
        return items[getRightChildIndex(index) ];
     }

     private boolean hasLeftChild(int index){
        return getLeftChildIndex(index) <= size;
     }
     private boolean hasRightChild(int index){
        return getRightChildIndex(index) <= size;
     }
}
