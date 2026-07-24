class Solution {
    class Pair{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> (b.freq - a.freq));
        for(int i : map.keySet()){
            pq.add(new Pair(i, map.get(i)));
        }

        int[] ans = new int[k];
        int n = 0;
        while(n<k){
            ans[n] = pq.poll().ele;
            n++;
        }
        return ans;
    }
}