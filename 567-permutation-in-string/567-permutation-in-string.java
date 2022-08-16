class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
      HashMap<Character,Integer> hm=new HashMap();
      for(int i=0;i<s1.length();i++){
          if(hm.containsKey(s1.charAt(i))){
              hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
          }
          else{
              hm.put(s1.charAt(i),1);
          }
      }
        int s=0;
        int e=s1.length()-1;
        
        while(e<s2.length()){
            HashMap<Character,Integer> hm1=new HashMap();
            String t=s2.substring(s,e+1);
            for(int i=0;i<t.length();i++){
               if(hm1.containsKey(t.charAt(i))){
              hm1.put(t.charAt(i),hm1.get(t.charAt(i))+1);
          }
          else{
              hm1.put(t.charAt(i),1);
          }
            }
            if(hm.equals(hm1)) return true;
            
            s++;
            e++;
        }
        return false;
    }
}