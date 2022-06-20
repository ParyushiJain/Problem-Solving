class Solution {
    List<List<Integer>> r;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        r=new ArrayList();
     
        List<Integer> ip=new ArrayList();
      
       solve(0,candidates,target,ip);
        return r;
        
    }
   
    public void solve(int idx,int[] candidates,int target,List<Integer> ip){
        if(idx==candidates.length){
            if(target==0){
                r.add(new ArrayList<>(ip));
              
            }
              return;
        }
        if(candidates[idx]<=target){
            ip.add(candidates[idx]);
            solve(idx,candidates,target-candidates[idx],ip);
            ip.remove(ip.size()-1);
        }
        solve(idx+1,candidates,target,ip);
    }
    
}