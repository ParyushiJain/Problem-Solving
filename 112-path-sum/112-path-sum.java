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
    boolean r=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
       dfs(root,targetSum);
        return r;
    }
    public void dfs(TreeNode root,int t){
        if(root==null){
            return;
        }
        if(t==root.val && root.right==null && root.left==null){
            r=true;
           
        }
        else{
            dfs(root.left,t-root.val);
            dfs(root.right,t-root.val);
        }
    }
}