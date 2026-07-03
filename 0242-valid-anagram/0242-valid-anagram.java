class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            int a = s.charAt(i) - 'a';
            freq[a]++;
        }

        for(int i=0;i<s.length();i++){
             int a = t.charAt(i) - 'a';
             if(freq[a]==0){
                return false;
             }
             freq[a]--;
        }

        return true;


    }
}