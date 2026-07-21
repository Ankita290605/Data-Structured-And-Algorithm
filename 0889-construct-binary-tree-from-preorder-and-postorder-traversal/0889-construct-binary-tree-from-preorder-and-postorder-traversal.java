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
    public TreeNode solve(int[] preorder, int[] postorder, HashMap<Integer, Integer> map, int low, int high){
        if(low>high) return null;
        TreeNode node = new TreeNode(preorder[next++]);
        if (low == high)
            return node;

        int indx = map.get(preorder[next]);
       
        node.left = solve(preorder, postorder, map, low, indx);
        node.right = solve(preorder, postorder, map, indx+1, high-1);
        
        return node;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<postorder.length;i++){
            map.put(postorder[i], i);
        }
        return solve(preorder, postorder, map, 0, postorder.length-1);
    }
}