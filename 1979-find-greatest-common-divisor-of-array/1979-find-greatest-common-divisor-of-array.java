class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int s = Integer.MAX_VALUE;
        int l = 0;

        for(int i=0;i<nums.length;i++){
            if(s>nums[i]){
                s = nums[i];
            }
            if(l<nums[i]){
                l = nums[i];
            }
        }

        return gcd(s, l);


    }
}