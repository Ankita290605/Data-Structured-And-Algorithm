class Solution {
    public String replaceDigits(String s) {
        String ans = "";

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int ch = s.charAt(i) - '0';
                char c = ans.charAt(ans.length()-1);

                for(int j=0;j<ch;j++){
                    c++;
                }
                ans += c;
            }
            else{
                ans += s.charAt(i);
            }
        }

        return ans;
    }
}