class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] r=new int[2];
        int s=0;
        int l=nums.length-1;
        while(s<=l){
            if(nums[s]+nums[l]==target){
                r[0]=s+1;
                r[1]=l+1;
                break;
            }
            else if(nums[s]+nums[l]>target){
                l--;
            }
            else{
                s++;
            }
        }
        return r;
    }
}