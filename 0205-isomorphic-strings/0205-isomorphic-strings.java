class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char a = t.charAt(i);

            if(map1.containsKey(ch) && map1.get(ch)!=a){
                return false;
            }

            if(map2.containsKey(a) && map2.get(a)!=ch){
                return false;
            }
            

            map1.put(ch, a);
            map2.put(a, ch);
        }

        return true;
    }
}