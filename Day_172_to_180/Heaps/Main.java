public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3,10,2,4,16,8,90};
        MaxHeap maxHeap = new MaxHeap(nums.length);

        for(int num: nums){
            maxHeap.insert(num);
        }
        // debugg the heap at Done as breakpoint!
        System.out.println("Done.");


        //    Heap sort
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.remove());
        }
    }       
}
