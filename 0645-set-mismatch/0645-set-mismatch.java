class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       
        int ans[] = new int[2];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                ans[1] = i;
            }
            if(map.containsKey(i) && map.get(i)==2){
                ans[0] = i;
            }
        }

        return ans;
    }
}