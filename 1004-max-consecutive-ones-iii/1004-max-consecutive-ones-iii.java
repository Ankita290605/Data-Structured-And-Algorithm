class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int s = 0;
        int l = 0;
        
        int z = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }

            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            ans = Math.max(ans, i-l+1);
        }
        return ans;
    }
}