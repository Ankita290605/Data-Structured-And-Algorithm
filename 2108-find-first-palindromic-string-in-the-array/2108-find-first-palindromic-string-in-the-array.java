class Solution {
    public boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int i=0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }

        return "";
    }
}