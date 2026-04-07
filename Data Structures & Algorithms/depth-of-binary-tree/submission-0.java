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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return maxDepthHelper(root, 1);
    }

    public int maxDepthHelper(TreeNode leaf, int depth) {
        if (leaf.left != null && leaf.right != null) {
            return Math.max(maxDepthHelper(leaf.left, depth+1), maxDepthHelper(leaf.right, depth+1));
        } else if (leaf.left != null) {
            return maxDepthHelper(leaf.left, depth+1);
        } else if (leaf.right != null) {
            return maxDepthHelper(leaf.right, depth+1);
        } else {
            return depth;
        }
    }
}
