package searching_algorithem;

public class Searcher {
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

   

public static int RecursiveBinarySearch(int[] arr, int val, int start , int end){

    if(start >end) return -1;
    int mid = (start + end)/2;

    if(arr[mid] ==val) return mid;

     if(arr[mid] > val){
        return RecursiveBinarySearch(arr, val, start, mid-1);
    }
    
    return RecursiveBinarySearch(arr, val, mid+1, end);
    
}

//    in binary search we need to sort the array first
    public static int binarySearch(int[] arr, int val){
        int start =0;
        int end = arr.length-1;

        while(start <= end){

            int mid = (start + end)/2;

            if(arr[mid] == val) return mid;

            else if(arr[mid] > val){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }


    public static int exponentialSearch(int[] arr, int val){

        if(arr[0] == val) return 0;

        int currentIndex = 1;

        while(currentIndex < arr.length && arr[currentIndex] <= val){
            currentIndex = currentIndex * 2;

            if(currentIndex >= arr.length){
                currentIndex = arr.length -1;

            }
            return binarySearch(arr, val ,currentIndex /2,currentIndex);
        }
    }
}