class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int cn=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                cn=Math.max(cn, dfs(i,j,grid));
            }
        }
       
        return cn;
    }
    public int dfs(int r,int c,int[][] grid){
        int ar=0;
        if(c<0 || r<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return 0;
        }
        grid[r][c]=0;
        ar+=1+(dfs(r+1,c,grid)+dfs(r,c+1,grid)+dfs(r-1,c,grid)+dfs(r,c-1,grid));
        
        return ar;
    }
}