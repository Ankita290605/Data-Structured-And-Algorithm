class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        HashSet<Character> set = new HashSet<>();

        for (char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }

        int ans = 0;
        String[] words = text.split(" ");

        for (String word : words) {
            boolean canType = true;

            for (char ch : word.toCharArray()) {
                if (set.contains(ch)) {
                    canType = false;
                    break;
                }
            }

            if (canType) {
                ans++;
            }
        }

        return ans;
    }
}