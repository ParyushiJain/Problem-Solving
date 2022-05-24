class Solution {
    
    public void setZeroes(int[][] matrix) {
          int rs=matrix.length;
        int cs=matrix[0].length;
        int row[]=new int[rs];
        int col[]=new int[cs];
        for(int i=0;i<rs;i++){
            for(int j=0;j<cs;j++){
                if(matrix[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
     for(int i=0;i<rs;i++){
         for(int j=0;j<cs;j++){
           if(row[i]==-1 || col[j]==-1){
               matrix[i][j]=0;
           }
         }
     }
       
    }
}