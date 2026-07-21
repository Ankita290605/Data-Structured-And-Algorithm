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
    int m = Integer.MAX_VALUE;
    public void solve(TreeNode root, int s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            m = Math.min(m,s);
        }
        
        solve(root.left, s+1);

        solve(root.right, s+1);

    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        solve(root, 1);
        return m; 
    }
}