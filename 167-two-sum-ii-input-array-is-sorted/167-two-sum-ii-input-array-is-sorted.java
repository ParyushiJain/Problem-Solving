class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int[] ra=new int[2];
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                ra[0]=l+1;
                ra[1]=r+1;
                return ra;
            }
            else if(numbers[l]+numbers[r]<=target){
                l++;
            }
            else{
                r--;
            }
        }
        return ra;
    }
}