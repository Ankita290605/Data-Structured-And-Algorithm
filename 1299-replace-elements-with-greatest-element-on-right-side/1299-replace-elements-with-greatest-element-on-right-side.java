class Solution {
    public int[] replaceElements(int[] arr) {
        int m = -1;
        int[] ans = new int[arr.length];
        ans[arr.length-1] = -1;

        for(int i=arr.length-2;i>=0;i--){

            if(m<arr[i+1]){
                m = arr[i+1];
            }

            ans[i] = m;
        }
        
        return ans;
    }
}