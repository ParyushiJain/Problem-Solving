class Solution {
    public int pivotIndex(int[] nums) {
       int[] p=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            p[i]=s;
        }
        for(int i=0;i<nums.length;i++){
            if((p[p.length-1]-p[i])==(p[i]-nums[i])) return i;
            
        }
        return -1;
    }
}