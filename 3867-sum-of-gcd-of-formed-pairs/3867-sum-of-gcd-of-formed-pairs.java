class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        long ans = 0;
        int[] a = new int[nums.length];
        a[0] = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i], max);
            a[i] = gcd(nums[i], max);
        }

        Arrays.sort(a);

        int i=0;
        int j=a.length-1;
        while(i<j){
            ans += gcd(a[i], a[j]);
            i++;
            j--;
        }

        return ans;

    }
}