// Last updated: 8/5/2026, 2:39:15 PM
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
17    List<List<Integer>> ans = new ArrayList<>();
18    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
19        dfs(root, targetSum, new ArrayList<>());
20        return ans;
21    }
22    public void dfs(TreeNode root, int targetSum, List<Integer> path) {
23        if (root == null)
24            return;
25        path.add(root.val);
26        if (root.left == null && root.right == null && targetSum == root.val) {
27            ans.add(new ArrayList<>(path));
28        }
29        dfs(root.left, targetSum - root.val, path);
30        dfs(root.right, targetSum - root.val, path);
31        path.remove(path.size() - 1);
32    }
33}