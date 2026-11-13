class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();

        String s = "";
        String ss = "";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){

                if(!s.equals("")){
                    ans.add(new ArrayList<>(Arrays.asList(s, ss)));
                }
                s = "";
                ss = "";
            }
            else{
                s += s1.charAt(i);
                ss += s2.charAt(i);

                if(i==s1.length()-1 && !s.equals("")){
                    ans.add(new ArrayList<>(Arrays.asList(s, ss)));
                }
            }
        }

        return ans;
    }
}