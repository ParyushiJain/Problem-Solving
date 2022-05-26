class Solution {
    public String removeOuterParentheses(String s) {
       String r="";
       ArrayList<Character> al=new ArrayList<Character>();
        char[] a=s.toCharArray();
        for(char c:a){
            if(c=='(' && al.size()==0){
                al.add(c);
            }
            else if(c=='('&& al.size()!=0){
                al.add(c);
                r+=c;
            }
            else if(c==')'&&al.size()==1){
                
                al.remove(0);
            }
            else{
                r+=c;
                al.remove(al.size()-1);
            }
        }
        
        return r;
    }
}