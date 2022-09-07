class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r=new ArrayList();
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
           if(i==0 ||( i>0 && nums[i]!=nums[i-1] )){
           int a=0-nums[i];
              
           int s=i+1;
           int e=nums.length-1;
           while(s<e){
               
               if(nums[s]+nums[e]==a){
                  
                   r.add(Arrays.asList(nums[s], nums[e], nums[i]));
                   
                   while(s<e && nums[s] == nums[s+1]) s++ ;    
                    
                 
                   while(s<e && nums[e] == nums[e-1]) e-- ;
                   
                   s++ ; e-- ; 
               }
               else if(nums[s]+nums[e]<a){
                   s++;
               }
               else{
                   e--;
               }
           }
           }
       }
        return r;
    }
}