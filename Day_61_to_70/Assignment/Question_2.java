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

  public static int  search(int nums[], int target){

    int min = minSearch(nums);
    if(nums[min] <= target && target <= nums[nums.length-1]){
      return search(nums,min,nums.length-1,target);
    }
   else{
    return search(nums,0,min,target);
   }
    
  }
  // binary Search to find target in left to right boundary
  public static int search(int[] nums,int left,int right,int target){
    
    int l = left;
    int r = right;
    System.out.println(l+" "+r);
    while (l <= r) {
      int mid = l + (r-l)/2;
      if(nums[mid] == target){
        return mid;
      }
      else if(nums[mid] > target){
        r = mid -1;
      }
      else{
        l= mid+1;
      }
    }

    return -1;

      }

  // smallest element index
  public static int minSearch(int[] nums){
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

    int r= search (nums, target);
    System.out.println(r);
  }
}
