class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i]*nums[i];
        }

        Arrays.sort(arr);

        int n = arr.length / 2;

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans -= arr[i];
        }

        for (int i = n; i < arr.length; i++) {
            ans += arr[i];
        }

        return ans;
    }
}
