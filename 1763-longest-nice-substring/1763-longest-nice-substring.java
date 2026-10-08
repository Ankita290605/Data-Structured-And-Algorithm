class Solution {
    public String longestNiceSubstring(String s) {

        if(s.length() < 2){
            return "";
        }

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            char lower = Character.toLowerCase(ch);
            char upper = Character.toUpperCase(ch);

            if(s.indexOf(lower)==-1 || s.indexOf(upper)==-1) {

                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));

                if(left.length() >= right.length()){
                    return left;
                } 
                else{
                    return right;
                }
            }
        }

        return s;
    }
}