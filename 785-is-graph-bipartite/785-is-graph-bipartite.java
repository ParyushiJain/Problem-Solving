class Solution {
    public boolean isBipartite(int[][] graph) {
      int n=graph.length;
        int[] vis=new int[n];
        Arrays.fill(vis,-1);
       for(int i=0;i<n;i++){
           if(vis[i]==-1){
               if(!check(i,vis,graph)) return false;
           }
           
       }
        return true;
    }
    public boolean check(int i,int[] vis,int[][] graph){
      
        for(int el:graph[i]){
            if(vis[el]==-1){
                vis[el] = 1 - vis[i];

                if (!check(el, vis, graph)) return false;
            } 
           
            
            else if(vis[el]==vis[i]){
                return false;
            }
        }
        return true;
    }
}