class Solution {
    public String truncateSentence(String s, int k) {
        String ans = "";
        k--;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (k == 0) break;
                k--;
            }

            ans += s.charAt(i);
        }

        return ans;
    }
}