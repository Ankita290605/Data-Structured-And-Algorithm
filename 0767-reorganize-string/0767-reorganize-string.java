class Solution {
    class Pair{
        char c;
        int f;
        Pair(char c, int f){
            this.c = c;
            this.f = f;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.f - a.f);
        for(char ch : map.keySet()){
            pq.add(new Pair(ch, map.get(ch)));
        }

        Pair prev = null;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            ans.append(curr.c);
            curr.f--;

            if(prev!=null && prev.f>0){
                pq.add(prev);
            }

            prev = curr;
        }

        if(ans.length()!=s.length()){
            return "";
        }
        
        return ans.toString();
    }
}