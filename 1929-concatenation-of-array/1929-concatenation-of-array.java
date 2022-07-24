class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] r=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            r[i]=nums[i];
            r[i+nums.length]=nums[i];
        }
        return r;
    }
}