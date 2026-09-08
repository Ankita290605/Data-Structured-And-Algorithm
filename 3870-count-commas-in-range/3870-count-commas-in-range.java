class Solution {
    public int countCommas(int n) {
        int count = 0;

        String t = Integer.toString(n);
        if(t.length()<4) return 0;

        for (int i = 1000; i <= n; i++) {
            String s = Integer.toString(i);

            if (s.length() >= 4) {
                count += (s.length() - 1) / 3;
            }
        }

        return count;
    }
}