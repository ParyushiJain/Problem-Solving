class Solution {
    public int[] shuffle(int[] nums, int n) {
       int i=0;
        int j=0;
        int[] r=new int[2*n];
        while(i<n && j<2*n){
           r[j]=nums[i];
            r[j+1]=nums[i+n];
            i++;
            j=j+2;
        }
        return r;
    }
}