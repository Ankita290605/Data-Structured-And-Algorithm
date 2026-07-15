class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() && s.charAt(i)==')'){
                ans++;
            }
            else if(!st.isEmpty() && s.charAt(i)==')'){
                st.pop();
            }

            else{
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            ans++;
            st.pop();
        }

        return ans;
    }
}