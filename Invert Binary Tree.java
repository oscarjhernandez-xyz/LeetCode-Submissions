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
    public TreeNode invertTree(TreeNode root) {

        // Invoke recursive method and return root
        invertNodes(root);
        return root;
    }

    private void invertNodes(TreeNode node) {

        // If current node is null, return
        if (node == null) { return; }

        else {

            // Swap nodes and repeat methods with children nodes
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            invertNodes(node.left);
            invertNodes(node.right);
        }
    }
}
