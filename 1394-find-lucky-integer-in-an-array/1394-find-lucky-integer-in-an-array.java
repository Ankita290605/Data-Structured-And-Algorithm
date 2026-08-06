class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int i : map.keySet()){
            if(i==map.get(i)){
                ans = i;
            }
        }

        return ans;
    }
}