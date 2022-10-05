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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode rt=new TreeNode(val,root,null);
            return rt;
        }
        else{
            TreeNode r=add(root,val,depth-1);
            return r;
        }
    }
    public TreeNode add(TreeNode root,int val,int depth){
        if ( root == null )
        {
            return root;
        }
        
        if(depth == 1)
        {
            root.left = new TreeNode(val,root.left,null);
            root.right  = new TreeNode(val,null,root.right);
            return root;
        }
        
        root.left = add(root.left,val,depth-1);
        root.right = add(root.right,val,depth-1);
        return root;
    }
}