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
    public boolean solve(TreeNode root, TreeNode s){
        if(root==null && s==null) return true;
        if(root==null || s==null) return false;
        if(root.val!=s.val) return false;
        return solve(root.left, s.left) && solve(root.right, s.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(root.val==subRoot.val){
            if(solve(root, subRoot)) return true;
            //else return false;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
      
    }
}