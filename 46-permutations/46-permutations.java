class Solution {
    List<List<Integer>> r;
    public List<List<Integer>> permute(int[] nums) {
        r=new ArrayList();
        List<Integer> in=new ArrayList();
        boolean[] fr=new boolean[nums.length];
        permute(nums,in,fr);
        return r;
    }
    public void permute(int[] nums, List<Integer> in,boolean[] fr){
        if(in.size()==nums.length){
            r.add(new ArrayList<>(in));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!fr[i]){
                in.add(nums[i]);
                fr[i]=true;
                permute(nums,in,fr);
                in.remove(in.size()-1);
                fr[i]=false;
            }
            
        }
       
    }
}