/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void solve(TreeNode root, List<List<Integer>> ans, int t, List<Integer> path){
        if(root==null) return;
        t -= root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && t==0){
            ans.add(new ArrayList(path));
        }
    
        solve(root.left, ans, t, path);
        solve(root.right, ans, t, path);

        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        solve(root, ans, targetSum, path);
        return ans;
    }
}