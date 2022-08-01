class Solution {
    List<String>  r=new ArrayList();
    public List<String> generateParenthesis(int n) {
        int o=n;
        int c=n;
       
        String op="";
        bal(o,c,op);
        return r;
    }
    public void bal(int o,int c,String op){
        if(o==0 && c==0){
            r.add(op);
            return;
        }
        if(o!=0){
            String op1="(";
            op1=op+op1;
            bal(o-1,c,op1);
        }
        if(c>o){
            String op2=")";
            op2=op+op2;
            bal(o,c-1,op2);
        }
    }
}