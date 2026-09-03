class Solution {
    public boolean uniformArray(int[] nums1) {
        int ans[] = new int[nums1.length];
        boolean odd = false;
        boolean even = false;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                even = true;
            }
            else odd = true;
        }

        if(even==true && odd==false) return true;
        if(even==false && odd==true) return true;

        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0)
                min = Math.min(min, nums1[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0) ans[i] = nums1[i];
            else{
                if(nums1[i]-min >= 1){
                    ans[i] = nums1[i]-min;
                }

                if(ans[i]==0) return false;
            }
        }

        return true;
    }
}