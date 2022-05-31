class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] r=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
          
            if(hm.containsKey(target-nums[i])){
               r[0]=hm.get(target-nums[i]);
                   r[1]=i;
            }
            hm.put(nums[i],i);
            
        }
        
        return r;
    }
}