class Solution {
    public int pivotIndex(int[] nums) {
        int ts = 0;

        for(int i : nums){
            ts += i;
        }
        int p = 0;
        for(int i=0;i<nums.length;i++){
            
            int s = ts - p - nums[i];
            if(p==s){
                return i;
            }
            p += nums[i];
        }

        return -1;
    }
}