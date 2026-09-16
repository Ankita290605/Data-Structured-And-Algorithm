class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        boolean[] used = new boolean[1000];

        for (int i = 1; i <= 9; i++) {

            if (freq[i] == 0) continue;
            freq[i]--;

            for (int j = 0; j <= 9; j++) {

                if (freq[j] == 0) continue;
                freq[j]--;

                for (int k = 0; k <= 8; k += 2) {

                    if (freq[k] > 0) {
                        int num = i * 100 + j * 10 + k;
                        used[num] = true;
                    }
                }

                freq[j]++;
            }

            freq[i]++;
        }

        int count = 0;

        for (int num = 100; num <= 998; num++) {
            if (used[num]) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num = 100; num <= 998; num++) {
            if (used[num]) {
                result[index++] = num;
            }
        }

        return result;
    }
}