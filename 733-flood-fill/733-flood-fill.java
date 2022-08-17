class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int c=image[sr][sc];
        if(c!=color) dfs(image,sr,sc,c,color);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int c,int color){
        if(image[sr][sc]==c){
            image[sr][sc]=color;
            if(sr>=1) dfs(image,sr-1,sc,c,color);
            if(sc>=1) dfs(image,sr,sc-1,c,color);
            if(sr<image.length-1) dfs(image,sr+1,sc,c,color);
            if(sc<image[0].length-1) dfs(image,sr,sc+1,c,color);
        }
    }
}