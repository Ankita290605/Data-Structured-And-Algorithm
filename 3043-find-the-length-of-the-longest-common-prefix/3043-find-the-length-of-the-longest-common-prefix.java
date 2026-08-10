class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1){
            while(num > 0){
                set.add(num);
                num /= 10;
            }
        }
        int ans = 0;

        for(int num : arr2){
            int original = num;
            int len = 0;

            while(num>0){
                if(set.contains(num)){
                    len = String.valueOf(num).length();
                    break;
                }
                num /= 10;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}