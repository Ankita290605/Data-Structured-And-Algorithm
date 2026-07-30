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
 
    public boolean solve(TreeNode root, int t){
        if(root==null){
            return false;
        }

        t -= root.val;
        if(root.left==null && root.right==null) return t==0;

        return solve(root.left, t) || solve(root.right, t);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum) ;
    }
}