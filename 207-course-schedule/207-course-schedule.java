class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> edges=new ArrayList();
        for(int i=0;i<numCourses;i++){
            edges.add(new ArrayList());
        }
        for(int i=0;i<prerequisites.length;i++){
            edges.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] vis=new int[numCourses] ;
        int[] dfsVis=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(dfs(i,vis,dfsVis,edges)) return false;
            }
        }
       
        return true;
    }
    public boolean dfs(int i,int[] vis,int[] dfsVis , ArrayList<ArrayList<Integer>> edges){
        vis[i]=1;
        dfsVis[i]=1;
        for(int el:edges.get(i)){
            if(vis[el]==0){
               if(dfs(el,vis,dfsVis,edges)) return true;
            }
            else if(dfsVis[el]==1){
                return true;
            }
        }
        dfsVis[i]=0;
        return false;
    }
}