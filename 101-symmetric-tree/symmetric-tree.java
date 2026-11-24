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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return check(root.left,root.right);
        
    }
    public boolean check(TreeNode root_l, TreeNode root_r){
        if(root_l == null && root_r == null){
            return true;
        }
        else if(root_l == null || root_r == null){
            return false;
        }
        if(root_l.val != root_r.val ){
            return false;
        }
        return check(root_l.left , root_r.right) && check(root_l.right , root_r.left);
    }
}