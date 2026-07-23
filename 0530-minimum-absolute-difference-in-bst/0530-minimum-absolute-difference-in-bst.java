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
    int n = Integer.MAX_VALUE;
    TreeNode prev = null;
    public void solve(TreeNode root){
        if(root==null) return;
    
        solve(root.left);

        if(prev!=null){
            if(Math.abs(prev.val - root.val) < n){
                n = Math.min(n, Math.abs(prev.val - root.val));
            }
        }
        
        prev = root;
        solve(root.right);
        
    }
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        return n;
    }
}