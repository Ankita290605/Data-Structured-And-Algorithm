class Solution {
    public boolean checkString(String s) {
        int x = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && x==1){
                return false;
            }
            else if(s.charAt(i)=='b'){
                x = 1;
            }
        }

        return true;
    }
}