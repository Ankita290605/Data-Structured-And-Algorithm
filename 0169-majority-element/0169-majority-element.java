class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int m = n/2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int ele : map.keySet()){
            if(map.get(ele) > m){
                return ele;
            }
        }

        return -1;
    }
}