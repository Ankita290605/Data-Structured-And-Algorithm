class Solution {
    public boolean stoneGame(int[] piles) {
        int i = 0;
        int j = piles.length-1;

        int a = 0, b = 0;

        for(int k=0;k<piles.length;k++){
            int max = 0;
            int min = Integer.MAX_VALUE;
            
            if(k%2==0){
                if(piles[i]>piles[j]){
                    max = piles[i];
                    i++;
                }
                else{
                    max = piles[j];
                    j--;
                }
                a += max;
            }
            else{
                if(piles[i]>piles[j]){
                    min = piles[j];
                    j--;
                }
                else{
                    min = piles[i];
                    i++;
                }
                b += min;
            }
        }

        return a>b;
    }
}