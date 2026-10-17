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
    int min = Integer.MAX_VALUE;
    int past = -1;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(past==-1){
            past = root.val;
        }
        else{
        min = Math.min(min, root.val - past);
        past = root.val;
        }
        inorder(root.right);
        
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);

        return min;
    }
}