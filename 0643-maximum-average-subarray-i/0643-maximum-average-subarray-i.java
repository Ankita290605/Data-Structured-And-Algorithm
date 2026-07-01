class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = 0;
        double ans = 0;
        double s = 0;

        for(int i=0;i<k;i++){
            s += nums[i];
        }
        ans = s;
        
        for(int i=k;i<nums.length;i++){
            s = s - nums[l] + nums[i];
            ans = Math.max(ans, s);
            l++;
        }

        return ans/k;
    }
}