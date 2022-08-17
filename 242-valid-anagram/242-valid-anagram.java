class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] a=s.toCharArray();
        Arrays.sort(a);
        s=new String(a);
        char[] b=t.toCharArray();
        Arrays.sort(b);
        t=new String(b);
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=t.charAt(i)) return false; 
           
        }
        return true;
    }
}