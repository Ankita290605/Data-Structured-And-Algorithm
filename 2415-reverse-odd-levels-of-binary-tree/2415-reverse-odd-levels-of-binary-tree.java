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
    public void solve(TreeNode left, TreeNode right, int i){
        if(left==null || right==null) return;

        if(i%2==1){
            int t = left.val;
            left.val = right.val;
            right.val = t;
        }

        solve(left.left, right.right, i+1);
        solve(left.right, right.left, i+1);

    }
    public TreeNode reverseOddLevels(TreeNode root) {
        solve(root.left, root.right, 1);
        return root;
    }
}