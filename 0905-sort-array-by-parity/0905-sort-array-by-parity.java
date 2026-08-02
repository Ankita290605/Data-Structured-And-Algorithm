class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int j = nums.length-1;
        int k = 0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]%2==0){
                ans[k] = nums[i];
                k++;
             }
             else{
                ans[j] = nums[i];
                j--;
             }
        }

        return ans;
    }
}