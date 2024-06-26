import java.util.ArrayList;
import java.util.List;

public class _46_Permutations_of_String{
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void solve(int[] nums, int index, List<List<Integer>> result){
        if(index >= nums.length){
            List<Integer> copy = new ArrayList<>();
            for(int num : nums){
                copy.add(num);
            }
            result.add(copy);
            return;
        }

        for(int i = index; i < nums.length; i++){
            swap(nums, i, index);
            solve(nums, index + 1, result);
            swap(nums, i, index);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, result);
        return result;
    }
}