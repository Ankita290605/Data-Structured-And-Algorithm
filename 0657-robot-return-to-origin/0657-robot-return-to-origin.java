class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0;
        int d = 0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                l--;
            }
            else if(moves.charAt(i)=='L'){
                l++;
            }
            else if(moves.charAt(i)=='U'){
                d--;
            }
            else{
                d++;
            }
        }

        if(l!=0 || d!=0){
            return false;
        }

        return true;
    }
}