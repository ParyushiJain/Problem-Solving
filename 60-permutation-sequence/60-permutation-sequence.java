class Solution {
    
    public String getPermutation(int n, int k) {
         ArrayList<Integer> al=new ArrayList();
        int fac=1;
        for(int i=1;i<n;i++){
            fac=fac*i;
            al.add(i);
        }
        al.add(n);
        k=k-1;
        String r="";
        while(true){
            r=r+(al.get(k/fac)).toString();
            al.remove(k/fac);
            if(al.size()==0){
                break;
            }
            k=k%fac;
            fac=fac/al.size();
            
        }
        return r;
    }
}