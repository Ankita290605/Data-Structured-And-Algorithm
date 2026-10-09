class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];

        return Math.max(solve(nums, 0, n-2), solve(nums, 1, n-1));
    }

    public int solve(int[] nums, int i, int end) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return helper(nums, i, end, dp);
    }

    public int helper(int[] nums, int i, int end, int[] dp) {
        if(i>end) return 0;

        if(dp[i]!=-1) return dp[i];

        int rob = nums[i] + helper(nums, i+2, end, dp);
        int skip = helper(nums, i+1, end, dp);

        return dp[i] = Math.max(rob, skip);
    }
}