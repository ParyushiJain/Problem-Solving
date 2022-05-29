class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int l=nums.length;
        
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
        
       List<Integer> list=new ArrayList<Integer>();
        for (Map.Entry mapElement : hm.entrySet()) {
            if( (int)mapElement.getValue()>(l/3)){
                list.add((int)mapElement.getKey());
            }
      
            
        }
        return list;
    }
}