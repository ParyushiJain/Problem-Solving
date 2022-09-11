class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i=0,j=0,mx=0;
        HashMap<Character,Integer> hm=new HashMap();
        while(j<s.length()){
            
            if(hm.containsKey(s.charAt(j))){
                int f=hm.get(s.charAt(j));
                f=f+1;
                hm.put(s.charAt(j),f);
               
            }
            else{
                hm.put(s.charAt(j),1);
            
            }
            
           
          if(hm.size()==j-i+1){
                mx=Math.max(mx,j-i+1);
                j++;
            }
            else if(hm.size()<j-i+1){
                while(hm.size()<j-i+1){
                   
                        int f=hm.get(s.charAt(i));
                        f=f-1;
                      hm.put(s.charAt(i),f);
                        if(hm.get(s.charAt(i))==0){
                            hm.remove(s.charAt(i));
                          
                        }
                        
                          
                        
                    
                        
                        i++;
                }
                j++;
            }
        }
        return mx;
    }
}