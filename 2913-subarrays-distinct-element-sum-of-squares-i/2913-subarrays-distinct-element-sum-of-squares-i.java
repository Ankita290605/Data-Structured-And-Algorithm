class Solution {
    public int sumCounts(List<Integer> nums) {
        int totalSum = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                seen.add(nums.get(j));
                int distinctCount = seen.size();
               
                totalSum += distinctCount * distinctCount;
            }
        }
        
        return totalSum;
    }
}