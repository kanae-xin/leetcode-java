/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return root;
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        if(root.left != null)
            left = lowestCommonAncestor(root.left, p, q);
        if(root.right != null)
            right = lowestCommonAncestor(root.right, p, q);
        if(left == p && right == q)
            return root;
        else if(left == p)
            return left;
        else
            return right;
    }
}