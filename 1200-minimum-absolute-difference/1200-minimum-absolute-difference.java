class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int m = Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1]) < m){
                m = Math.abs(arr[i]-arr[i+1]);
            }
        }

        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1]) == m){
                List<Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                ans.add(a);
            }
        }

        return ans;
    }
}