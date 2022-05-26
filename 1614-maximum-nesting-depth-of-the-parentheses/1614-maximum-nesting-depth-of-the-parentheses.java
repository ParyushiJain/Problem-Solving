class Solution {
    public int maxDepth(String s) {
        int co=0;
        int max=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
               co++;
           }
           max=Math.max(max,co);
           if(s.charAt(i)==')'){
               co--;
           }
       }
        return max;
    }
}