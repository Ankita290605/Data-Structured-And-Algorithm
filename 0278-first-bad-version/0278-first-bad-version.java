/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int st = 1;
        int end = n;
        int ans = n;
        while(st<=end){
            int mid = st + (end - st)/2;

            boolean flag = isBadVersion(mid);
            if(flag==false){
                st = mid + 1;
            }
            else{
                end = mid - 1;
                ans = mid;
            }
        }

        return ans;

    }
}