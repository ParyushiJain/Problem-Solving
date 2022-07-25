class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] r=new int[2];
    
        int i=bs(0,nums.length-1,nums,target);
        System.out.print(i);
        if(i==-1){
            r[0]=-1;
            r[1]=-1;
        }
        else{
           int idx=i;
            int j=i;
            while(idx>0 && nums[idx-1]==target){
               idx--; 
            }
            r[0]=idx;
            while(j<nums.length-1 && nums[j+1]==target){
                j++;
            }
           r[1]=j;
         }
        return r;
    }
    public int bs(int s,int e,int[] nums,int t){
        if(s>e){
            return -1;
        }
        int m=(s+e)/2;
        if(nums[m]==t){
            return m;
        }
        else if(t<nums[m]){
            return bs(s,m-1,nums,t);
        }
        else{
            return bs(m+1,e,nums,t);
        }
    }
}