/*
Question 1: Given an integer array nums, return true if any value appears at least twice in the 
array, and return false if every element is distinct. 
Example 1:
Input: nums = [1, 2, 3, 1]
Output: true
Example 2:
Input: nums = [1, 2, 3, 4]
Output: false

*/

import java.util.HashSet;

class Least_twice_In_Array{

  public static boolean testing_Twice(int num[]){
    // this approach take time-complexity of --> O(n^2)
    boolean flag = false;
    for (int i=0; i<num.length -1;i++) {
      for (int j =i+1; j < num.length-1; j++) {
        if(num[i] == num[j]){
          flag = true;
        }
      }

    }
    return flag;

  }

  public static boolean approach2(int num[]){
      // this approach take time-complexity of --> O(n)
      HashSet<Integer> set = new HashSet<>();
      for(int i=0; i<num.length -1;i++){
        if(set.contains(num[i])){
          return true;
        }
        else{
          set.add(num[i]);
        }
      }
      
      return false;
  }
  public static void main(String [] args){
    int num[] = {1,2,3,4,5,1,1,7,5,8,4,2,3};
        
    boolean r= testing_Twice(num);
    boolean a2= approach2(num);
    System.out.println(r);
    System.out.println(a2);

  }
}