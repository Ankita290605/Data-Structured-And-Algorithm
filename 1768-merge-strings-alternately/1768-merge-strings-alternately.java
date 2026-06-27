class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int i=0;
        int j=0;
        while(word1.length()>i && word2.length()>j){
            s += word1.charAt(i);
            s += word2.charAt(j);
            i++;
            j++;
        }

        if(i<word1.length()){
            while(word1.length()>i){
                s += word1.charAt(i);
                i++;
            }
        }

        if(j<word2.length()){
            while(word2.length()>j){
                s += word2.charAt(j);
                j++;
            }
        }

        return s;
    }
}