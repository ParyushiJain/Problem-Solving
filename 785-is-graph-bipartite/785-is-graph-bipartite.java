class Solution {
    public boolean isBipartite(int[][] graph) {
      int[] col=new int[graph.length];
        Arrays.fill(col,-1);
        for(int i=0;i<col.length;i++){
            if(col[i]==-1){
                if(!bfs(i,col,graph)) return false;
            }
        }
        return true;
    }
    public boolean bfs(int i,int[] col,int[][] graph){
     
        for(int el:graph[i]){
            if(col[el]==-1){
                col[el]=1-col[i];
                if(!bfs(el,col,graph)) return false;
            }
            else if(col[el]==col[i]) return false;
        }
    
    return true;
    }
}