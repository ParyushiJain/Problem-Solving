class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int c=0;
      Arrays.sort(properties,(a,b)-> (a[0]==b[0])?a[1]-b[1]:b[0]-a[0]);
       int mx=properties[0][1];
        
        for(int i=1;i<properties.length;i++){
           if(properties[i][1]<mx){
               c++;
           }
            else{
            mx=properties[i][1];
            }
        }
        
        return c;
    }
}