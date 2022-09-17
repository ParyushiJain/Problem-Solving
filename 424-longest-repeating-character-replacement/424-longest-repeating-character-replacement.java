class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap();
        int j=0;
        int i=0;
        int mx=0;
        
        
        while(j<s.length()){
            if(hm.containsKey(s.charAt(j))){
                int f=hm.get(s.charAt(j));
                f=f+1;
                
                hm.put(s.charAt(j),f);
            }
            else{
               hm.put(s.charAt(j),1);
            }
            int r=GetMaxCount(hm); 
            
          
            if(((j-i+1)-r)<=k){
                mx=Math.max(mx,j-i+1);
                   j++;
               
            }
            else if(((j-i+1)-r)>k){
                while(((j-i+1)-r)>k){
                 
                int f=hm.get(s.charAt(i));
                f=f-1;
               
                hm.put(s.charAt(i),f);
                      if(hm.get(s.charAt(i))==0) hm.remove(s.charAt(i));
            
           
                    i++;
                }
                j++;
            }
         
            
           
        }
        return mx;
    }
    public int GetMaxCount(HashMap<Character,Integer> hashMap)
    {
        int max = 0;
        for (var value : hashMap.values()) {
            max = Math.max(max,value);
        }
        return max;
    }
}