class Solution {
    List<List<Integer>> r;
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        r=new ArrayList();
         List<Integer> i=new ArrayList<Integer>();
        solve(al,i);
        return r;
    }
    public void solve(ArrayList<Integer> al,List<Integer> i){
        
        if(al.size()==0){
            r.add(i);
            return;
        }
        List<Integer> op1=new ArrayList(i); 
        List<Integer> op2=new ArrayList(i); 
        op2.add(al.get(0));
        ArrayList<Integer> ip=new ArrayList(al);
        ip.remove(0);
        solve(ip,op1);
        solve(ip,op2);
       
        
    }
}