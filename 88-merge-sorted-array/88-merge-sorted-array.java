class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1[0]=nums2[0];
        }
       
       if(n>=1){ 
        int[] r=new int[m+n];
        int k=0;
       for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                if(nums1[i]>nums2[j]){
                    System.out.println("he");
                    int t=nums1[i];
                    nums1[i]=nums2[j];
                    nums2[j]=t;
                    Arrays.sort(nums2);
                    r[i]=nums1[i];
                }
                else{
                  r[i]=nums1[i];  
                }
            }
        }
           
                System.out.println(r[0]);
            
        for(int i=m;i<(m+n);i++){
            r[i]=nums2[i-m];
        }
        
       for(int i=0;i<m+n;i++){
           nums1[i]=r[i];
       } 
       }
    }
}