class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];

            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } 
            else {
                if (st.isEmpty()) return false; 

                char top = st.peek();

                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {
                    st.pop(); 
                } else {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
