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
    public void solve(TreeNode root, ArrayList<Long> list, int lvl){
        if(root==null) return;
        if(lvl == list.size()){
            list.add((long) root.val);
        } 
        else{
            list.set(lvl, list.get(lvl) + root.val);
        }
        solve(root.left, list, lvl+1);
        solve(root.right, list, lvl+1);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> list = new ArrayList<>();
        solve(root, list, 0);
        if(k>list.size()) return -1;

        Collections.sort(list, Collections.reverseOrder());
        return list.get(k-1);
    }
}