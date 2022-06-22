class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 ){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String r=strs[0];
       for(int i=1;i<strs.length;i++){
           r=solve(r,strs[i]);
           
       }
        return r;
    }
    public String solve(String s1,String s2){
        String t="";
        int slen;
        if(s1.length()<s2.length()){
            slen=s1.length();
        }
        else{
            slen=s2.length();
        }
        for(int i=0;i<slen;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                t+=s1.charAt(i);
            }
            else{
                break;
            }
        }
        return t;
    }
}