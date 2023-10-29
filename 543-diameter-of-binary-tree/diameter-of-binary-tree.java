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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;
        if(root == null)
            return 0;
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        int ll = height(root.left);
        int rr = height(root.right);

        return Math.max((ll+rr),Math.max(ld,rd));
        
    }
    public int height(TreeNode root){
         if(root == null)
            return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        int l=0,r=0;
        l += height(root.left);
        r += height(root.right);

        return Math.max(l,r) + 1;
    }
}