class Solution {

    public boolean isDivisible(int n, int t, boolean flag){
        int p = 1;
        while(n>0){
            int r = n%10;
            p *= r;
            n = n/10;
        }

        if(p%t==0) return true;
        return false;
    }
    public int smallestNumber(int n, int t) {
        boolean flag = false;
        while(flag==false){
            flag = isDivisible(n,t,flag);
            n = n+1;
        }

        return n-1;
    }
}