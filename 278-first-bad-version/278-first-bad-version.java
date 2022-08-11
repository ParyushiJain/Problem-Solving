/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int l=0;
         int h=n;
        int ans=0;
         int m=l+(h-l)/2;
        while(l<=h){
           
            if(isBadVersion(m)){
               ans=m;
                h=m-1;
            }
            else{
              l=m+1; 
            }
            m=l+(h-l)/2;
        }
    
     return ans;
    }
}