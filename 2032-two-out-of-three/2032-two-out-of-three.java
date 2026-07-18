class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        for (int num : nums3) set3.add(num);

        int[] freq = new int[101];

        for (int num : set1) freq[num]++;
        for (int num : set2) freq[num]++;
        for (int num : set3) freq[num]++;

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (freq[i] >= 2) {
                ans.add(i);
            }
        }

        return ans;
    }
}