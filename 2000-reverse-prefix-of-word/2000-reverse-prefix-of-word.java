class Solution {
    
    public String reversePrefix(String word, char ch) {
        //StringBuilder sb = new StringBuilder(word);
        int indx = -1;
        String s = "";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                s += word.substring(0, i+1);
                indx = i;
                break;
            }

        }
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        String p = new String(arr);
        for(int k=indx+1;k<word.length();k++){
            p+=word.charAt(k);
        }

        return p;
    }
}