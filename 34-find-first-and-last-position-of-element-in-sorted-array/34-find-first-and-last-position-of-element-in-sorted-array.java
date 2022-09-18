class Solution {
    public int[] searchRange(int[] n, int t) {
        int r1=bsf(0,n.length-1,n,t);
        int r2=bsl(0,n.length-1,n,t);
        int[] ra=new int[2];
        ra[0]=r1;
        ra[1]=r2;
        return ra;
    }
    public int bsf(int s,int e,int[] n,int t){
        int r=-1;
        while(s<=e){
            int m=s+((e-s)/2);
            if(n[m]==t){
                r=m;
                e=m-1;
            }
            else if(t>n[m]) s=m+1;
            else e=m-1;
        }
        return r;
    }
     public int bsl(int s,int e,int[] n,int t){
        int r=-1;
        while(s<=e){
            int m=s+((e-s)/2);
            if(n[m]==t){
                r=m;
                s=m+1;
            }
            else if(t>n[m]) s=m+1;
            else e=m-1;
        }
        return r;
    }
}