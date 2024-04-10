/*
 * There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity. 
Example 1:
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
Output: 4
 */


public class Question_2 {

  public static int  rotated(int nums[], int target){
   
    return 0;
  }

  // smallest element index
  public int minSearch(int[] nums){
    int left =0;
    int right = nums.length-1;

    while(left < right){
      int mid = left + (right - left)/2;
      if(mid > 0 && nums[mid-1] >nums[mid]){
        return mid;
      }
      else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
        left = mid+1;
      }
    }
    return left;
  }
  public static void main(String[] args) {
    int nums[] = {0,1,2,4,5,6,7}; 
    int target = 3;

    int r= rotated(nums, target);
    System.out.println(r);
  }
}
