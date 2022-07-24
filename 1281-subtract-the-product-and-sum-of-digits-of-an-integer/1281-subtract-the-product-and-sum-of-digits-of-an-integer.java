class Solution {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> al=new ArrayList();
        while(n>0){
            int m=n%10;
            al.add(m);
            n=n/10;
        }
        int p=al.get(0);
        for(int i=1;i<al.size();i++){
            p=p*al.get(i);
        }
        int a=0;
        for(int i=0;i<al.size();i++){
            a+=al.get(i);
        }
        return (p-a);
    }
}