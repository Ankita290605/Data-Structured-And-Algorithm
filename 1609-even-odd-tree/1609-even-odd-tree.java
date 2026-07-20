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
    class Pair{
        TreeNode node;
        int l;
        Pair(TreeNode node, int l){
            this.node = node;
            this.l = l;
        }
    }
    public boolean isEvenOddTree(TreeNode root) {
        int l = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, l));
        int currLevel = 0;
        int prev = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            Pair curr = q.poll();
            TreeNode r = curr.node;
            int lvl = curr.l;

            if (lvl != currLevel) {
                currLevel = lvl;

                if (lvl % 2 == 0)
                    prev = Integer.MIN_VALUE;
                else
                    prev = Integer.MAX_VALUE;
            }

            if(lvl%2==0){
                if(r.val%2==0 || r.val <= prev)
                    return false;
            }
            if(lvl%2!=0){
                
                if(r.val%2!=0 || r.val >= prev)
                    return false;
            }

            prev = r.val;

            if(r.left!=null){
                q.add(new Pair(r.left, lvl+1));
            }
            if(r.right!=null){
                q.add(new Pair(r.right, lvl+1));
            }

        }

        return true;
    }
}