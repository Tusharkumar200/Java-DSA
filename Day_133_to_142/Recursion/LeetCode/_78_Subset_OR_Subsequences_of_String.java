import java.util.ArrayList;
import java.util.List;

public class _78_Subset_OR_Subsequences_of_String {
    private void solve(int[] nums, int i, List<Integer> temp, List<List<Integer>> result){
            if(i >= nums.length){
                List<Integer> copyList = new ArrayList<>();
                for(int num: temp){
                    copyList.add(num);
                }
                result.add(copyList);
                return;
            }

            // Exclude
            solve(nums, i+1 , temp, result);

            // Include
            temp.add(nums[i]);
            solve(nums, i+1, temp, result);
            temp.remove(temp.size() -1);
    }

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp,result);
        return result;
    }
}
