

public class Build_a_minHeap{
    
    private static void heapify(int[] arr, int index){
        int smallestIndex = index;
        int size = arr.length;
        int lci = index * 2 + 1;
        int rci = index * 2 + 2;

        if(lci <size && arr[smallestIndex] > arr[lci]){
            smallestIndex = lci;
        }

        if(rci <size && arr[smallestIndex] > arr[rci]){
            smallestIndex = rci;
        }

        if(smallestIndex == index){
            return;
        }

        // swap
        int t = arr[smallestIndex];
        arr[smallestIndex] = arr[index];
        arr[index] = t;

        heapify(arr, smallestIndex);

    }

    public static int[] buildMinHeap(int[] arr){

        int size = arr.length;

        for(int i= size -1; i>=0; i--){
            heapify(arr, i);
        }
        return arr;
    }
}