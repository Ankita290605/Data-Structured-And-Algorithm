class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> 
            Integer.compare(a[1], b[1])
        );

        int ans = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<intervals.length;i++){
            if(max > intervals[i][0]){
                ans++;
            }
            else{
                max = intervals[i][1];
            }
        }

        return ans;
    }
}