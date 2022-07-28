class Solution {
   
    public String removeDuplicates(String s) {
     Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()==false && st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String r="";
        while(st.isEmpty()==false){
            r+=st.pop();
        }
        StringBuilder str=new StringBuilder(r);
        r=str.reverse().toString();
       return r; 
    }
   
}