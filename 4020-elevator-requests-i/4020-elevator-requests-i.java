class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans = 0;
        int curr = 0;
        for(int i=0;i<requests.length;i++){
            int a = Math.abs(curr - requests[i]);
            curr = requests[i];
            ans += a;
        }

        return ans;
    }
}