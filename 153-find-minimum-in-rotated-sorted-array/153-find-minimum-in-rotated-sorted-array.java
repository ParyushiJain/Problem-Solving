class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
     int x=bs(0,nums.length-1,nums);
        return x;
    }
    public int bs(int s,int e,int[] n){
        
        while(s<=e ){
            int m=s+((e-s)/2);
            if( (n[m]<n[(m+1)%n.length] && n[m]<n[(m+n.length-1)%n.length])){
                return n[m];
            }
            else if( (n[m]>n[e])) return bs(m+1,e,n);
            else  return bs(0,m,n);
        }
        return -1;
    }
}