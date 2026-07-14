class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
                continue;
            }
            if(nums[i]>min){
                ans = Math.max(ans, nums[i]-min);
            }
        }

        return ans;
    }
}