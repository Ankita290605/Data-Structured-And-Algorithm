class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        
        String[] arr = path.split("/");

        for(String i : arr){
            if(i.equals("") || i.equals(".")){
                continue;
            }
            else if(i.equals("..")){
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            else{
                st.push(i);
            }
        }

        if(st.isEmpty()){
            return "/";
        }

        for (String dir : st) {
            sb.append("/");
            sb.append(dir);
        }

        return sb.toString();
    }
}