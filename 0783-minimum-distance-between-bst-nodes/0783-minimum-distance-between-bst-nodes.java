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
    TreeNode prev = null;
    int m = Integer.MAX_VALUE;
    public void solve(TreeNode root){
        if(root==null) return;

        solve(root.left);
        if(prev!=null){
            m = Math.min(m, root.val - prev.val);
        }

        prev = root;
        solve(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        solve(root);
        return m;
    }
}