class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int r = 0;
        int l = 0;
        for(char ch : s.toCharArray()){
            if(ch=='R') r++;
            else if(ch=='L') l++;
            if(r==l){
                ans++;
            }
        }

        return ans;
    }
}