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
    List<Integer> r=new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return r;
        }
      if(root.left!=null)  postorderTraversal(root.left);
     if(root.right!=null)   postorderTraversal(root.right);
        r.add(root.val);
        return r;
    }
}