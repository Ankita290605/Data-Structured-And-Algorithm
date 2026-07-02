class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int ps = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps += nums[i];
            if(map.containsKey(ps - k)){
                ans += map.get(ps-k);
            }
            map.put(ps, map.getOrDefault(ps, 0) + 1);
        }

        return ans;
    }
}