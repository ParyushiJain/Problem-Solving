class Solution {
    public int search(int[] nums, int target) {
        return Bs(0,nums.length-1,nums,target);
    }
    int Bs(int l,int h, int[] nums,int t){
        int m=(l+h)/2;
        while(l<=h){
            if(t==nums[m]){
                return m;
            }
            else if(t<nums[m]){
                return Bs(0,m-1,nums,t);
            }
            else{
                return Bs(m+1,h,nums,t);
            }
        }
        return -1;
    }
}