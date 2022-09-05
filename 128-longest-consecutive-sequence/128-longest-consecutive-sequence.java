class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int c=1;
        int l=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                c++;
                l=Math.max(c,l);
            }
            else if((nums[i]==nums[i+1])){
                c+=0;
            }
            else{
                
                l=Math.max(c,l);
                c=1;
            }
        }
        return l;
    }
}