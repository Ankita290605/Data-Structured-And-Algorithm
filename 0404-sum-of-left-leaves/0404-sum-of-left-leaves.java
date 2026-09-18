class Solution {
    int s = 0;

    public void solve(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }

        if (isLeft && root.left == null && root.right == null) {
            s += root.val;
            return;
        }

        solve(root.left, true);
        solve(root.right, false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        solve(root, false);
        return s;
    }
}