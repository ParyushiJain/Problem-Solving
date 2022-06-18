class Solution {
    List<List<Integer>> al;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        al=new ArrayList();
        List<Integer> ip=new ArrayList();
        ArrayList<Integer> num=new ArrayList();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        solve(num,ip);
        return al;
    }
    public void solve(ArrayList<Integer> num,List<Integer> ip){
        if(num.size()==0){
            Collections.sort(ip);
            if(!al.contains(ip)){
            al.add(ip);
            }
            return;
        }
        List<Integer> op1=new ArrayList(ip);
        List<Integer> op2=new ArrayList(ip);
        op2.add(num.get(0));
        ArrayList<Integer> newip=new ArrayList(num);
        newip.remove(0);
        solve(newip,op1);
        solve(newip,op2);
    }
}