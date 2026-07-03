class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if((str.charAt(i)-'a' >=0 && str.charAt(i)-'a' < 26) || (str.charAt(i)>='0' && str.charAt(i)<='9')){
                ans += str.charAt(i);
            }
        }

        int i=0;
        int j = ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}