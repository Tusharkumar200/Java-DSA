

public class K_th_Smallest_Element {

    private static void heapify(int[] arr, int i){

        int maxIndex = i;
        int size = arr.length;
        int lc= i * 2+1;
        int rc= i * 2+2;

        if(lc < size && arr[maxIndex] < arr[lc]) maxIndex = lc;
        if(rc < size && arr[maxIndex] < arr[rc]) maxIndex = rc;

        if(maxIndex == i) return ;

        int t = arr[maxIndex];
        arr[maxIndex] = arr[i];
        arr[i] = t;
        heapify(arr,maxIndex);
    }
        public static int kthSmallest(int[] arr, int l , int r, int k){
            int [] heap = new int[arr.length];

            // put K elements in the heap

            for(int i=0; i<k; i++){
                heap[i] = arr[i];
              
            }
//          Normal Heapify
            for(int i=k -1; i>=0; i--){
                    heapify(heap,i);
            }

            for(int i = k; i<arr.length; i++){
                if(arr[i] > heap[0]) continue;
                heap[0] = arr[i];
                heapify(heap, 0);
            }

            return heap[0];
        }
}
