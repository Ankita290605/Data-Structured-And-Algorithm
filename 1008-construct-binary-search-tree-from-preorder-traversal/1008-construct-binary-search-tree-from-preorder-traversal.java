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
    int i = 0;
    public TreeNode solve( int[] preorder,int min ,int max){
        if(i==preorder.length) return null;
        if(preorder[i]<min || preorder[i]>max) return null;
       
        TreeNode root = new TreeNode(preorder[i]);
        i++;
        root.left = solve( preorder, min, root.val);
        root.right = solve( preorder, root.val , max); 
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return solve( preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }
}