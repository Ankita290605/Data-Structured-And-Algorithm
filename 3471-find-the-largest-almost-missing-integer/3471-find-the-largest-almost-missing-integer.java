class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        if (k == 1) {
            int[] freq = new int[51];

            for (int num : nums) {
                freq[num]++;
            }

            for (int num = 50; num >= 0; num--) {
                if (freq[num] == 1) {
                    return num;
                }
            }

            return -1;
        }

        if (n == k) {
            int ans = 0;

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 1; i < n - 1; i++) {
            set.add(nums[i]);
        }

        if (nums[0] == nums[n - 1]) {
            return -1;
        }

        if (set.contains(nums[0]) && set.contains(nums[n - 1])) {
            return -1;
        }

        if (set.contains(nums[0])) {
            return nums[n - 1];
        }

        if (set.contains(nums[n - 1])) {
            return nums[0];
        }

        return Math.max(nums[0], nums[n - 1]);
    }
}