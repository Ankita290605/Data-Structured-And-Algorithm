class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(int i=0;i<patterns.length;i++){
            String s = patterns[i];
            if(word.indexOf(s)!=-1){
                ans++;
            }
        }
        return ans;
    }
}