class Solution {
    public int searchInsert(int[] nums, int t) {
        if(nums[nums.length-1]<t){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
                return i;
            
            }
            else if(nums[i]>t){
                return i;
            }
        }
        return -1;
    }
}