class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int len = s.length()+1;
        int n = s.length();
        int c = 0;
        int l = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                c++;
            }

            while(c==k){
                int currlen = i - l + 1;
                String curr = s.substring(l, i + 1);

                if (currlen < len || 
                    (currlen == len && curr.compareTo(ans) < 0)) {
                    len = currlen;
                    ans = curr;
                }

                if(s.charAt(l)=='1'){
                    c--;
                }
                l++;
            }
        }

        if(len>n) return "";
        else return ans;
    }
}