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
    int prev = 0;
    public TreeNode solve(int[] preorder, int[] inorder, HashMap<Integer, Integer> map, int low, int high){
        if(low>high) return null;
        
        TreeNode node = new TreeNode(preorder[prev]);
        int l = map.get(preorder[prev]);
        prev++;
        node.left = solve(preorder, inorder, map, low, l-1);
        node.right = solve(preorder, inorder, map, l+1, high);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int r = preorder[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        return solve(preorder, inorder, map, 0, inorder.length-1);

    }
}