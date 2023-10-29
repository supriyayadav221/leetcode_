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
    public int minDepth(TreeNode root) {
        if(root == null)
        return 0;
        Queue<TreeNode> q = new LinkedList<>(List.of(root));
        int depth = 0;
        while(q.size()>0){
            depth++;

            int rowlen = q.size();
            for(int i =0; i< rowlen; i++){
            TreeNode node = q.poll();

                if(node.left!= null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                if(node.left == null && node.right == null) {
                    //leaf node
                    return depth;
                }
            }
        }
        return depth;
    }
}