class Solution {
    public int searchInsert(int[] nums, int t) {
      int s=0;
      int e=nums.length-1;
        
       
        
      while(s<e-1){
           int m=(s+e)/2;
        if(nums[m]==t){
            return m;
        }  
          else if(t<nums[m]){
              e=m;
          }
          else{
              s=m;
          }
      }
        
        if(t<=nums[s]){
            return s;
        }
        else if(t<=nums[e]){
            return e;
        }
        else if(t>nums[e]){
            return e+1;
        }
        else{
            return -1;
        }
    }
}