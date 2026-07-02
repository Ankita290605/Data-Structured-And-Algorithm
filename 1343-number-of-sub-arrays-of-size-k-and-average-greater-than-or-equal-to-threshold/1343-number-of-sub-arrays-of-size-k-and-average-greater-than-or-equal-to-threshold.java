class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int l = 0;
        int s = 0;
        for(int i=0;i<k;i++){
            s += arr[i];
        }
        if(s/k>=threshold){
            ans++;
        }

        for(int i=k;i<arr.length;i++){
            s = s-arr[l]+arr[i];
            if(s/k>=threshold){
                ans++;
            }
            l++;
        }

        return ans;

    }
}