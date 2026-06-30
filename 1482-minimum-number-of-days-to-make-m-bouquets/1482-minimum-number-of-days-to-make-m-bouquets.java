class Solution {
    public boolean canMake(int[] arr, int m, int k, int mid){
        int f = 0;
        int bouquets = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                f++;
            }
            else{
                f = 0;
            }
            if(f == k){
                    bouquets++;
                    f = 0; 
                }
        }

        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int st = 1;
        int end = 0;
        int ans = -1;
        for(int i : bloomDay){
            end = Math.max(end, i);
        }

        while(st<=end){
            int mid = st + (end-st)/2;

            if(canMake(bloomDay, m, k, mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
}