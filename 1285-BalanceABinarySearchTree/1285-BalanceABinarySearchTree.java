// Last updated: 7/9/2026, 9:51:32 AM
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

    List<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0, list.size() - 1);
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    private TreeNode build(int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = build(l, mid - 1);
        node.right = build(mid + 1, r);

        return node;
    }
}
