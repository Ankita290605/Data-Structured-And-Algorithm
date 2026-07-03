class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if(s.length()>t.length()){
            return false;
        }
        for(int i=0;i<t.length() && j<s.length();i++){
            char ch = s.charAt(j);
            if(t.charAt(i)==ch){
                j++;
            }

        }

        return j == s.length();
    }
}