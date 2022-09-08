class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int q=1;
        int i=0;
        int j=height.length-1;
        while(i<=j){
            q=(j-i)*Math.min(height[i],height[j]);
            max=Math.max(q,max);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}