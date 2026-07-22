class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = Integer.MIN_VALUE;
        String num = "";
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num += ch;
            }
            else{
                if(!num.isEmpty()){
                    int n = Integer.parseInt(num);
                    if(n<=prev){
                        return false;
                    }
                    prev = n;
                    num = "";
                }
            }
        }

        if (!num.isEmpty()) {
            int n = Integer.parseInt(num);
            if (n <= prev) {
                return false;
            }
        }

        return true;
    }
}