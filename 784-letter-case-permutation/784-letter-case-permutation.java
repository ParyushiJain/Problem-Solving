class Solution {
    public String removeF(String s){
        s=s.substring(1);
        return s;
    }
    public List<String> letterCasePermutation(String s) {
        List<String> r=new ArrayList();
        String op="";
        permute(s,op,r);
        return r;
    }
    public void permute(String s,String op, List<String> r){
        if(s.length()==0){
            r.add(op);
            return;
        }
     if((s.charAt(0)>=65 && s.charAt(0)<=90) ||(s.charAt(0)>=97 && s.charAt(0)<=122) ){
         String op1="";
         String op2="";
         op1+=s.charAt(0);
         op1=op1.toUpperCase();
         op1=op+op1;
         op2+=s.charAt(0);
         op2=op2.toLowerCase();
         op2=op+op2;
         s=removeF(s);
         permute(s,op1,r);
         permute(s,op2,r);
         
     }
        else{
            op+=s.charAt(0);
            s=removeF(s);
            permute(s,op,r);
        }
    }
}