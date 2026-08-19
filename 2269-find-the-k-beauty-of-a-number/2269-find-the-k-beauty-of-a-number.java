class Solution {
    public int divisorSubstrings(int num, int k) {

        int ans = 0;
        String s = Integer.toString(num);
        int n = s.length();

        for (int i = 0; i <= n - k; i++) {

            String ss = s.substring(i, i + k);
            int x = Integer.parseInt(ss);

            if (x != 0 && num % x == 0) {
                ans++;
            }
        }

        return ans;
    }
}