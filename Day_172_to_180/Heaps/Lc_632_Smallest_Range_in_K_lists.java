import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


class Node{
    public int value;
    public int row;
    public int col;

    public Node(int value , int row, int col){
        this.value = value;
        this.row = row;
        this.col = col;
    }
}
public class Lc_632_Smallest_Range_in_K_lists {
    
    public int[] smallestRange(List<List<Integer>> nums) {
        
        Comparator<Node> compare = new Comparator<Node>(){
            public int compare(Node a, Node b){
                return a.value - b.value;
            }
        }
        
        // built - int MinHeap Heap
        PriorityQueue<Node> minHeap = new PriorityQueue<Node>(compare);
        int listCount = nums.size();

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        // Take first element from each fow and add to heap

        for(int i=0; i< listCount; i++){
            int num = nums.get(i).get(0); // First element of row i
            mini = Math.min(mini , num);
            maxi = Math.max(maxi, num);

            minHeap.add(new Node(num , i ,0));
        }

        int start = mini;
        int end = maxi;

        while(!minHeap.isEmpty()){
            Node top = minHeap.remove();
            int topValue = top.value;

            if(maxi - topValue < end - start){
                start =  topValue;
                end = maxi;
            }
        }
        
    }
}
