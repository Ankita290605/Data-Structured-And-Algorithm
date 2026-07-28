class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        StringBuilder sb1 = new StringBuilder();
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        char middle = '\0';

        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                sb1.append((char) ('a' + i));
            }
            if(freq[i]%2==1){
                middle = (char) ('a' + i);
            }
        }

        StringBuilder sb2 = new StringBuilder(sb1).reverse();

        if(middle!='\0'){
            return sb1.toString() + middle + sb2.toString();
        }

        return sb1.toString()+sb2.toString();

    }
}