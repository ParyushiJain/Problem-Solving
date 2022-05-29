class Solution {
    public double myPow(double x, int n) {
       double r=1.0;
        long nn=n;
        if(n<0){
            nn=nn*(-1);
        }
        while(nn>0){
        if(nn%2==0){
            x=x*x;
            nn=nn/2;
        }
        else{
          r=r*x;
            nn--;
        }
        }
        if(n<0){
            r=(double)1/(double)r;
        }
        return r;
    }
}