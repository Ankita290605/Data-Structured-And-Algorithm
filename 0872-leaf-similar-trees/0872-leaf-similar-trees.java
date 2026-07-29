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
    public void solve(TreeNode root, List<Integer> r1){
        if(root==null) return;
        if(root.left==null && root.right==null){
            r1.add(root.val);
        }
        solve(root.left, r1);
        solve(root.right, r1);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        solve(root1, r1);
        solve(root2, r2);
        
        return r1.equals(r2);
    }
}