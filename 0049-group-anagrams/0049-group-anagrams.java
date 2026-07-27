class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int indx = 0;
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String a = new String(ch);
            if(!map.containsKey(a)){
                map.put(a, new ArrayList<>());
                map.get(a).add(s);
            }
            else{
                map.get(a).add(s);
            }
        }

        for(String ele : map.keySet()){
            ans.add(map.get(ele));
        }

        return ans;
    }
}