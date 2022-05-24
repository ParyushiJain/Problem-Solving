class Solution {
    public int findDuplicate(int[] nums) {
       int[] c=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            c[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            c[t-1]++;
        }
         for(int i=0;i<nums.length;i++){
             if(c[i]>1){
                 return i+1;
             }
         }
        return 0;
    }
}