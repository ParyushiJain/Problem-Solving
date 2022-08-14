class Solution {
    public void moveZeroes(int[] nums) {
       int l=0;
        int r=0;
        while(l<nums.length && r<nums.length){
            if(nums[r]==0){
                r++;
            }
            else{
                if(l!=r){
                    int t=nums[l];
                    nums[l]=nums[r];
                    nums[r]=t;
                }
                l++;
                r++;
            }
        }
        
    }
}