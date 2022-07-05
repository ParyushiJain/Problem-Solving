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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> r=new ArrayList();
        if(root==null){
            return r;
        }
        Stack<TreeNode> st=new Stack();
        st.push(root);
        
        while(!st.isEmpty()){
           
            TreeNode n=st.pop();
            
            r.add(n.val);
            if(n.right!=null){
            st.push(n.right);
            }
            if(n.left!=null){
            st.push(n.left);
            }
        }
        return r;
    }
}