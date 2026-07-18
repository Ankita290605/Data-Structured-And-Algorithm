class Solution {
    public int minimumMoves(String s) {

        int ans = 0;
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == 'X') {
                ans++;
                i += 3;      // Skip these 3 characters
            } else {
                i++;
            }
        }

        return ans;
    }
}