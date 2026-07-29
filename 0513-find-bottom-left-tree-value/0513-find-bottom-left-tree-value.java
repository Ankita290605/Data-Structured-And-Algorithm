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
    int ans = 0;
    int m = -1;
    public void solve(TreeNode root, int l){
        if(root==null) return;
        if(m<l){
            ans = root.val;
            m = l;
            //prev = l;
        }
        solve(root.left, l+1);
        solve(root.right, l+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        
        solve(root, 0);
        return ans;
    }
}