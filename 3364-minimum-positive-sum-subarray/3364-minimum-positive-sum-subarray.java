class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;

        int n = l;
        while(n<=r){
            for(int i=0;i<=nums.size()-n;i++){
                int s = 0;
                for(int j=i;j<i+n;j++){
                    s += nums.get(j);
                }
                if(s>0){
                    ans = Math.min(ans, s);
                }

            }
            n++;
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}