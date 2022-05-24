class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int l= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            l=Math.max(l,sum);
            if(sum<0){
                sum=0;
            }
        }
        return l;
    }
}