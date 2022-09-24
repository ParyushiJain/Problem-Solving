class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums.length==1) return 0;
        
        int s=0;
        int e=nums.length-1;
        
        while(s<=e){
            int m=s+((e-s)/2);
          
            if(m>0 && m<nums.length-1){
            if(nums[m]>nums[m-1] && nums[m]>nums[m+1]){
               return m;
            }
            else if(nums[m]<nums[m+1]){
                s=m+1;
            }
            else if(nums[m]<nums[m-1]){
                e=m-1;
            }
            }
            else if(m==0){
                  if(nums[0]>nums[1]){ 
                   
                      return 0;
                  }
                else{
                    return 1;
                }
            }
           else if(m==nums.length-1){
                if( nums[nums.length-1]>nums[nums.length-2]) {
                    return nums.length-1;
                }
               else{
                  return nums.length-2;
               }
                
            }
            } 
        return -1;
            
        
       
    }
}