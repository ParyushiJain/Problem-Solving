class Solution {
    public int majorityElement(int[] nums) {
        
     int l=nums.length;
        if(l==1){
            return nums[0];
        }
     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<l;i++){
            int c=1;
            
            if(hm.containsKey(nums[i])){
                int ic=hm.get(nums[i]);
                c+=ic;
                hm.put(nums[i],c);
            }
            else{
                hm.put(nums[i],c);
            }
            
        }
        
        int m;
        int largest=0;
        for (Map.Entry mapElement : hm.entrySet()) {
            if( (int)mapElement.getValue()>(l/2)){
                 m = (int)mapElement.getKey();
                 largest=Integer.max(largest,m);
            }
      
            
        }
        return largest;
    }
}