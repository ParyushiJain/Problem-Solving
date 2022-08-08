class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int s=adj.size();
        int[] vis=new int[s];
        int[] dfsVis=new int[s];
        for(int i=0;i<vis.length;i++){
            if(vis[i]==0){
                if(dfs(i,adj,vis,dfsVis)) return false;
            }
        }
        return true;
    }
     public boolean dfs(int i,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] dfsVis){
         vis[i]=1;
         dfsVis[i]=1;
         for(int el:adj.get(i)){
             if(vis[el]==0){
                 if(dfs(el,adj,vis,dfsVis)) return true;
             }
             else if(vis[el]==dfsVis[el]){
                 return true;
             }
         }
         dfsVis[i]=0;
         return false;
     }
}