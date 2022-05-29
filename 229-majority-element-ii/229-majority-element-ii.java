class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int l=nums.length;
        
         int c1=0,c2=0;
        int n1=-1,n2=-1;
        for(int i=0;i<l;i++){
           if(nums[i]==n1){
               c1++;
               
           }
            else if(nums[i]==n2){
                c2++;
            }
            else if(c1==0){
                n1=nums[i];
                c1=1;
            }
            else if(c2==0){
                n2=nums[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
            
        }
        
        
       List<Integer> list=new ArrayList<Integer>();
         int cn1=0,cn2=0;
      for(int i=0;i<l;i++){
         
          if(n1==nums[i]){
              cn1++;
          }
          if(n2==nums[i]){
              cn2++;
          }
          
      }
        if(cn1>(l/3)){
            list.add(n1);
        }
        if(cn2>(l/3) && n1!=n2){
            list.add(n2);
        }
        return list;
    }
}