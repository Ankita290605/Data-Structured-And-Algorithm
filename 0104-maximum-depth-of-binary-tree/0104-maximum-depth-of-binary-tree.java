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
    int n = 0;
    public void solve(TreeNode root, int s){
        if(root==null){
            n = Math.max(n, s);
            return;
        }

        solve(root.left, s+1);
        solve(root.right, s+1);
        
    }
    public int maxDepth(TreeNode root) {
        solve(root, 0);
        return n;
    }
}