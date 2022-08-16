class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int l=0;
        int r=0;
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap();
        int c=Integer.MIN_VALUE;
        while(r<n){
            if(hm.containsKey(s.charAt(r))){
                l=Math.max(l,hm.get(s.charAt(r))+1);
            }
            hm.put(s.charAt(r),r);
            c=Math.max(r-l+1,c);
            r++;
        }
        return c;
    }
}