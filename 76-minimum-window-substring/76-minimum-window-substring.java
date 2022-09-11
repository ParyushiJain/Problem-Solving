class Solution {
    public String minWindow(String s, String t) {
        int i=0;
        int j=0;
        int mn=Integer.MAX_VALUE;
        String r="";
        HashMap<Character,Integer> hm=new HashMap();
        for(int in=0;in<t.length();in++){
            if(hm.containsKey(t.charAt(in))){
                int f=hm.get(t.charAt(in));
                f=f+1;
                hm.put(t.charAt(in),f);
            }
            else{
                hm.put(t.charAt(in),1);
            }
        }
        int c=hm.size();
        
        while(j<s.length()){
            if(hm.containsKey(s.charAt(j))){
                int f=hm.get(s.charAt(j));
                f=f-1;
                hm.put(s.charAt(j),f);
                if(hm.get(s.charAt(j))==0){
                    c--;
                }
            }
            
            if(c>0){
                j++;
            }
            else if(c==0){
                while(c==0){
                    if(j-i+1<mn){
                        mn=j-i+1;
                        r=s.substring(i,j+1);
                    }
                    
                    if(hm.containsKey(s.charAt(i))){
                        int f=hm.get(s.charAt(i));
                        f=f+1;
                        hm.put(s.charAt(i),f);
                        if(f==1) c++;
                    }
                    
                    
                    i++;
                }
                j++;
            }
            
        }
        return r;
    }
}