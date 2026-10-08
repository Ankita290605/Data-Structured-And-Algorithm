class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);

        if (nums.length == 1) {
            return nums[0];
        }

        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);

        return solve(nums, nums.length-1);
    }

    public int solve(int[] nums, int i){
        if(i==0){
            return dp[0];
        }
        if(i==1){
            return dp[1];
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        dp[i] = Math.max(solve(nums, i-1), nums[i]+solve(nums, i-2));

        return dp[i];
    }
}