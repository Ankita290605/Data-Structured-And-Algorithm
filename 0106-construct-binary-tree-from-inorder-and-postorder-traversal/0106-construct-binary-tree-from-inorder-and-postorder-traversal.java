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
    int next = 0;
    public TreeNode solve(int[] inorder, int[] postorder, HashMap<Integer, Integer> map, int low, int high){
        if(low>high) return null;
        TreeNode node = new TreeNode(postorder[next]);
        int indx = map.get(postorder[next]);
        next--;
        node.right = solve(inorder, postorder, map, indx+1, high);
        node.left = solve(inorder, postorder, map, low, indx-1);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        next = postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return solve(inorder, postorder, map, 0, postorder.length-1);
    }
}