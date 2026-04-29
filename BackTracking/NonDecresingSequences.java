class Solution {

    public void backT(int[] nums, int indx,  List<Integer> curr, List<List<Integer>> result){
        if(curr.size()>=2){
            result.add(new ArrayList<>(curr));
        }

        Set<Integer> s = new HashSet<>();

        for(int i=indx;i<nums.length;i++){
            if(s.contains(nums[i])) continue;
            if(curr.isEmpty() || nums[i]>=curr.get(curr.size()-1)){
                curr.add(nums[i]);
                s.add(nums[i]);
                backT(nums, i+1, curr, result);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backT(nums, 0, curr, result);
        return result;
    }
}