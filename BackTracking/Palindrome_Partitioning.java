class Solution {

    public boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void backT(String s, int indx, List<List<String>> result, List<String> curr){
        if(indx==s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=indx;i<s.length();i++){
            if(isPalindrome(s, indx, i)){
                curr.add(s.substring(indx, i+1));
                backT(s, i+1, result, curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backT(s, 0, result, curr);
        return result;
    }
}