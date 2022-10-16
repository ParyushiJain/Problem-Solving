class Solution {
    public String convertToTitle(int cn) {
        StringBuilder s=new StringBuilder();
        while(cn>0){
            int r=cn%26;
            if(r==0){
                s.append('Z');
                cn=cn/26-1;
            }
            else{
                s.append((char)(r-1+'A'));
                cn=cn/26;
            }
        }
        s=s.reverse();
        String r=new String(s);
        return r;
    }
}