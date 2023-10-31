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
     List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new LinkedList<>();
        paths(root,"");
        return ans;
    }
    void paths(TreeNode root, String s){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans.add(s.concat(String.valueOf(root.val)));
        }
        paths(root.left, s.concat(String.valueOf(root.val).concat("->")));
        paths(root.right, s.concat(String.valueOf(root.val).concat("->")));
    }
}