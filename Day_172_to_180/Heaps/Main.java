public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3,10,2,4,16,8};
        MaxHeap maxHeap = new MaxHeap(nums.length);

        for(int num: nums){
            maxHeap.insert(num);
        }
        System.out.println("Done.");
    }
}
