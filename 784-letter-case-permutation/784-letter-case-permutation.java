class Solution {
    List<String> r;
    public String removeF(String s){
        String r="";
        for(int i=1;i<s.length();i++){
            r+=s.charAt(i);
            
        }
        return r;
    }
    public List<String> letterCasePermutation(String s) {
        String op="";
        r=new ArrayList();
        permute(s,op);
    
        return r;
    }
    public void permute(String s,String op){
        if(s.length()==0){
            r.add(op);
            return;
        }
        if((s.charAt(0)>=97 &&s.charAt(0)<=122)||(s.charAt(0)>=65 &&s.charAt(0)<=90)){
         String op1="";
	        
	        
	        op1+=s.charAt(0);
	        op1=op+op1.toLowerCase();
	        String op2="";
	        
	        
	        op2+=s.charAt(0);
	        op2=op+op2.toUpperCase();
	        s=removeF(s);
	        permute(s,op1);
	        permute(s,op2);
        }
        else{
            String op1="";
            op1=op+s.charAt(0);
            s=removeF(s);
            permute(s,op1);
        }
    }
}