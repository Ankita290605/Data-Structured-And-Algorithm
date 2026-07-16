class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                int s = a+b;
                st.push(s);
            }
            else if(tokens[i].equals("-")){
                int a = st.pop();
                int b = st.pop();
                int s = b-a;
                st.push(s);
            }
            else if(tokens[i].equals("*")){
                int a = st.pop();
                int b = st.pop();
                int s = a*b;
                st.push(s);
            }
            else if(tokens[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                int s = b/a;
                st.push(s);
            }
            else{
                int a = Integer.parseInt(tokens[i]);
                st.push(a);
            }
        }

        return st.peek();
    }
}