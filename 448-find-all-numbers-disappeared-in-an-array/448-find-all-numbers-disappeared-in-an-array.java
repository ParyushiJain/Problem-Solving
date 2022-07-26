class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] c=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            c[t-1]++;
        }
        List<Integer> r=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(c[i]==0){
                r.add(i+1);
            }
        }
        return r;
    }
}