// Last updated: 8/10/2026, 11:43:08 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int postIndex;
18    public TreeNode buildTree(int[] inorder, int[] postorder) {
19        postIndex = postorder.length - 1;
20        return build(inorder, postorder, 0, inorder.length - 1);
21    }
22    public TreeNode build(int[] inorder, int[] postorder, int left, int right) {
23        if (left > right) {
24            return null;
25        }
26        int rootValue = postorder[postIndex];
27        postIndex--;
28        TreeNode root = new TreeNode(rootValue);
29        int index = left;
30        while (inorder[index] != rootValue) {
31            index++;
32        }
33        root.right = build(inorder, postorder, index + 1, right);
34        root.left = build(inorder, postorder, left, index - 1);
35        return root;
36    }
37}