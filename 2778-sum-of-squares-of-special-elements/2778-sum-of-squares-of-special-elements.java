class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        int indx = 1;
        for(int i : nums){
            if(nums.length%indx==0){
                ans += i*i;
            }
            indx++;
        }
        return ans;
    }
}