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
        
        Queue<Integer> q=new LinkedList();
        q.add(i);
        vis[i]=0;
        while(q.isEmpty()==false){
            int n=q.poll();
        for(int el:graph[n]){
            if(vis[el]==-1){
                vis[el]=1-vis[n];
                q.add(el);
            }
            else if(vis[el]==vis[n]){
                return false;
            }
        }
        }
       return true; 
    }
}