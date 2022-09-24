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
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>> r=new ArrayList();
        List<Integer> ds=new ArrayList();
        dfs(root,t,r,ds);
        return r;
    }
    public void dfs(TreeNode root, int t,List<List<Integer>> r, List<Integer> ds){
         if(root==null) return;
          ds.add(root.val);
        if(t==root.val && root.right==null && root.left==null){
            r.add(new ArrayList<>(ds));
           
        }
        else{
           dfs(root.left,t-root.val,r,ds);
        
        dfs(root.right,t-root.val,r,ds);  
        }
       
     
       
        ds.remove(ds.size()-1);
    }
}