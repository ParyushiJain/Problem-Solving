class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r=new int[nums.length];
        int[] l=new int[nums.length];
        l[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            l[i]=l[i-1]*nums[i];
        }
         r[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            r[i]=r[i+1]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(l[i]+" ");
        }
         System.out.println();
        for(int i=0;i<nums.length;i++){
            System.out.print(r[i]+" ");
        }
        int[] op=new int[nums.length];
        op[0]=r[1];
        op[nums.length-1]=l[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            op[i]=l[i-1]*r[i+1];
        }
        return op;
    }
}