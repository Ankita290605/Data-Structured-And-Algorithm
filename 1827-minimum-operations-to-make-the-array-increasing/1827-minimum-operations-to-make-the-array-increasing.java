class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int a = nums[i-1] - nums[i];
                nums[i] = nums[i]+a+1;
                ans += a+1;
            }
        }

        return ans;
    }
}