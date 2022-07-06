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
    public List<Integer> postorderTraversal(TreeNode root) {
        
         List<Integer> r=new ArrayList();
        if(root==null){
            return r;
        }
     Stack<TreeNode> s1=new Stack();
      Stack<TreeNode> s2=new Stack();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode n=s1.pop();
            s2.push(n);
            if(n.left!=null){
                s1.push(n.left);
            }
            if(n.right!=null){
                s1.push(n.right);
            }
        }
        while(!s2.isEmpty()){
            r.add(s2.pop().val);
        }
        return r;
    }
}