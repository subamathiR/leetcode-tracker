// Last updated: 7/9/2026, 9:51:43 AM
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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int current = 1;
        int answer = 1;
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            int size = q.size();
            int sum = 0;
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
            }
            if(sum>max)
            {
                max = sum;
                answer = current;
            }
            current++;
        }
        return answer;
    }
}