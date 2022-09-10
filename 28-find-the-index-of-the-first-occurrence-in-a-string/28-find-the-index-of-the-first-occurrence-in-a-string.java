class Solution {
    public int strStr(String haystack, String needle) {
        int k=needle.length();
        String s="";
        int j=0;
        int i=0;
        int r=-1;
        while(j<haystack.length()){
            s+=haystack.charAt(j);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(s.equals(needle)){
                    r=i;
                    break;
                }
                
                s=s.substring(1);
                i++;
                j++;
            }
        }
        return r;
    }
}