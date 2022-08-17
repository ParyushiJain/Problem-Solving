class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> al=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(al.containsKey(nums[i])) return true;
            else{
                al.put(nums[i],i);
            }
        }
        return false;
    }
}