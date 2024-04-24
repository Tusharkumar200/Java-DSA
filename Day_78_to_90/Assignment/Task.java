package Assignment;

public class Task {
  
  //  Bubble Sort
  public static void bubbleSort(int []nums){
    System.out.println("\nBubble Sort");
      for (int i = 0; i < nums.length-1; i++) {
        for (int j = 0; j < nums.length-1; j++) {
            if(nums[j] < nums[j+1]){
              int temp = nums[j];
              nums[j] = nums[j+1];
              nums[j+1] = temp;
            }          
        }
      }
  }

// Selection Sort

  public static void selectionSort(int[] nums){
    System.out.println("\nSelectin Sort");
    for (int i = 0; i < nums.length; i++) {
      int minPosition = i;
      for (int j = i+1; j < nums.length; j++) {
        if(nums[minPosition] < nums[j]){
          minPosition = j;
        }
      }
        int temp = nums[minPosition];
        nums[minPosition] = nums[i];
        nums[i] = temp;
    }
  }

  // Insertion Sort
public static void insertionSort(int[] nums){
  for (int i =1; i < nums.length; i++) {
    int curr = nums[i];
    int pre = i-1;
    while(pre>=0 && nums[pre] > curr){
      nums[pre+1] = nums[pre];
      pre--;
    }
    nums[pre+1] = curr;
  }
}

// countingSort

public static void countingSort(int[] nums){
  int largest = Integer.MIN_VALUE;
  for (int i = 0; i < nums.length; i++) {
      largest = Math.max(largest,nums[i]);
  }

  int count[] = new int[largest+1];
    for (int i = 0; i < nums.length; i++) {
      count[nums[i]]++;
    }

    int j=0;
    for (int i = 0; i < count.length; i++) {
      while(count[i] >0){
        nums[j] =i;
        j++;
        count[i]--;
      }
    }
}
  public static void printArray(int []nums){
    for (int index = 0; index < nums.length; index++) {
        System.out.println(nums[index]);
    }
  }
  public static void main(String[] args) {
    int []nums ={50,40,60,10,32,22,80};
    // bubbleSort(nums);
    // selectionSort(nums);
    // insertionSort(nums);
    countingSort(nums);
    printArray(nums);
  }
}
