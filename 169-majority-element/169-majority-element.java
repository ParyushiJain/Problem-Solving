class Solution {
    public int majorityElement(int[] nums) {
        
     int l=nums.length;
        if(l==1){
            return nums[0];
        }
     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<l-1;i++){
            int c=1;
            for(int j=i+1;j<l;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(hm.containsKey(nums[i])){
                int ic=hm.get(nums[i]);
                c+=ic;
                hm.put(nums[i],c);
            }
            else{
                hm.put(nums[i],c);
            }
            
        }
        
   
         int m=hm.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        return m;
    }
}