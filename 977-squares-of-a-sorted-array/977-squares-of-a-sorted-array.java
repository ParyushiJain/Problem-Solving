class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ra=new int[nums.length];
       int l=0;
        int r=nums.length-1;
        int idx=nums.length-1;
        while(l<=r){
            if(Math.abs(nums[r])>Math.abs(nums[l])){
                ra[idx]=nums[r]*nums[r];
                r--;
            }
            else{
                ra[idx]=nums[l]*nums[l];
                l++;
            }
            idx--;
        }
return ra;        
        }
}