class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        Arrays.sort(nums);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
         }
        int c=1;
        int l=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                c++;
                l=Integer.max(l,c);
            }
            else if(nums[i]==nums[i+1]){
                c=c+0;
                l=Integer.max(l,c);
            }
            else{
                c=1;
                l=Integer.max(l,c);
            }
        }
        return l;
    }
}