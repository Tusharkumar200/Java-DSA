public class BinarySearch {
  public static int bsearch(int number[], int key){

    int start =0; 
    int end = number.length-1;

    while(start <= end){
      int mid = (start+ end)/2;

      // comparison

      if(number[mid] == key){
          return mid;
      }
      else if(number[mid] < key){
        start = mid+1;
      }
      else{
        end = mid -1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {

    
    // in Binary Search array must be sorted.
    int number[] = {10,20,30,40,50,60,70,80,90};
    int key = 50;
    System.out.println("index of the key is: "+bsearch(number, key));
  }
}
