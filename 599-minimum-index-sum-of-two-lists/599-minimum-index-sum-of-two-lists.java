class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
      
        
        HashMap<String,Integer> hm=new HashMap();
        HashMap<String,Integer> hmin=new HashMap();
        for(int i=0;i<list1.length;i++){
            hm.put(list1[i],i);
        }
        
        for(int i=0;i<list2.length;i++){
            if(hm.containsKey(list2[i])){
               
                hmin.put(list2[i],i+hm.get(list2[i]));
                
            }
           
        }
        ArrayList<String> al=new ArrayList();
        int min=Collections.min(hmin.values());
        for(String i:hmin.keySet()){
            if(hmin.get(i)==min){
               al.add(i); 
            }
        }
        String[] r=new String[al.size()];
       for(int i=0;i<al.size();i++){
           r[i]=al.get(i);
       }
        return r;
    }
}