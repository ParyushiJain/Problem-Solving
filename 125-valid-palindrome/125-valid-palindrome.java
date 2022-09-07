class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> al=new ArrayList();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) ){
                char t=Character.toLowerCase(s.charAt(i));
                al.add(t);
            }
            if(s.charAt(i)>=48  && s.charAt(i)<=57){
                al.add(s.charAt(i));
            }
        }
        int l=0;
        int r=al.size()-1;
        while(l<=r){
            if(al.get(l)!=al.get(r)) return false;
            l++;
            r--;
            
        }
        return true;
    }
}