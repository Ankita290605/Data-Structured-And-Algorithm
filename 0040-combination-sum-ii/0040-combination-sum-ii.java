
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        Arrays.sort(nums);
        solve(0, nums, t, ans, arr);

        return ans;
    }

    public void solve(int indx, int[] nums, int t, List<List<Integer>> ans, List<Integer> arr) {

        if (t == 0) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = indx; i < nums.length; i++) {

            if (i > indx && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > t) {
                break;
            }

            arr.add(nums[i]);
            solve(i + 1, nums, t - nums[i], ans, arr);

            arr.remove(arr.size() - 1);
        }
    }
}
