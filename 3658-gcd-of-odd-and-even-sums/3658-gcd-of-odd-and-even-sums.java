class Solution {
    public int findGCD(int s1, int s2){
        while(s2!=0){
            int rem = s1%s2;
            s1 = s2;
            s2 = rem;
        }

        return s1;
    }
    public int gcdOfOddEvenSums(int n) {
        int s1 = n*n;
        int s2 = n * (n+1);

        return findGCD(s1, s2);
    }
}