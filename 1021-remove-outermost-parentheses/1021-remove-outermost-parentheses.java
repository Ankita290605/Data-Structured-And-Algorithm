class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int c = 0;

        for(char ch : s.toCharArray()){

            if(ch=='('){
                c++;

                if(c>1){
                    ans.append(ch);
                }
            } 
            else{
                if(c>1){
                    ans.append(ch);
                }

                c--;
            }
        }

        return ans.toString();
    }
}