public class IsSortingInArray {
  public static void main(String[] args) {
    System.out.println("Welcome to array sorting check post\n");
    int[] numArr =ArrayUtility.inputArray();
    boolean isInc = isIncreasing(numArr);
    boolean isDec = isDecreasing(numArr);
        if(isInc || isDec){
          System.out.println("Your Array is  shorted");
        }
        else{
          System.out.println("Your Array is not shorted.");
        }
  }

  static boolean isDecreasing(int[] numArr){
    for(int i=1; i < numArr.length;i++){
      if(numArr[i] > numArr[i-1]){
        return false;
      }
    }
      return true;
  }
  
  static boolean isIncreasing(int[] numArr){
    for(int i=1; i < numArr.length;i++){
      if(numArr[i] < numArr[i-1]){
        return false;
      }
    }
      return true;
  }

}
