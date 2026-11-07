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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        sideview(root,result,0);
        return result;      
    }
    private void sideview(TreeNode root, ArrayList<Integer> result, int level){
        if(root == null){
            return;
        }
        if(level == result.size()){
            result.add(root.val);
        }
        sideview(root.right,result,level+1);
        sideview(root.left,result,level+1);
    }
}