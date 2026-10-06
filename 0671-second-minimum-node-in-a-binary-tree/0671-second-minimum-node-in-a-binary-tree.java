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
    public void preorder(TreeNode root, HashSet<Integer> s){
        if(root==null) return;
        preorder(root.left, s);
        s.add(root.val);
        preorder(root.right, s);
    }
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        int secondMin = Integer.MAX_VALUE;
        preorder(root, set);
        if(set.size()<=1) return -1;
        int min = Integer.MAX_VALUE;

        for(int value : set){
            if(value < min){
                secondMin = min;
                min = value;
            }
            else if(value < secondMin){
                secondMin = value;
            }
        }

        return secondMin;

    }
}