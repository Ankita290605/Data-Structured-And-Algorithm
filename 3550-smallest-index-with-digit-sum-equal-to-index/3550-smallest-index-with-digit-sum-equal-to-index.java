class Solution {
    public int sum(int n) {
        int p = 0;

        while(n > 0) {
            int d = n % 10;
            p = p + d;
            n = n / 10;
        }

        return p;
    }
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int s = sum(nums[i]);
            if(s==i){
                return i;
            }
        }

        return -1;
    }
}