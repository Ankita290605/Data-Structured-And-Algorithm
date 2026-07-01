class Solution {
    public int minSwaps(int[] nums) {
        int ans = 0;
        int l = 0;
        int one = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) one++;
        }

        if(one==0) return 0;

        int s = 0;
        for(int i=0;i<one;i++){
            if(nums[i]==0){
                s++;
            }
        }

        ans = s;

        for(int i=one;i<nums.length+one;i++){
            if (nums[l] == 0) {
                s--;
            }
            l++;

            if(nums[i%nums.length]==0) s++;

            ans = Math.min(ans, s);
        }

        return ans;

    }
}