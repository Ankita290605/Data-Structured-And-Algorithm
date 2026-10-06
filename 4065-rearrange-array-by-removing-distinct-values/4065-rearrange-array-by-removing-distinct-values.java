class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int[] ans = new int[nums.length];
        int index = 0; 

        while(map.size() > 0){ 
            ArrayList<Integer> list = new ArrayList<>(map.keySet()); 
            Collections.sort(list); 
            for (int value : list){ 
                ans[index++] = value; 
                int freq = map.get(value); 

                if(freq == 1){ 
                    map.remove(value); 
                } 
                else{ 
                    map.put(value, freq - 1); 
                }
            }
        }
        return ans;
    }
}