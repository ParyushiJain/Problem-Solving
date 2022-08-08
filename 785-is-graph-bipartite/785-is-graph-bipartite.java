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
        col[i]=1;
        Queue<Integer> q=new LinkedList();
        q.add(i);
        while(q.isEmpty()==false){
            int n=q.poll();
            for(int el:graph[n]){
                if(col[el]==-1){
                    col[el]=1-col[n];
                    q.add(el);
                }
                else if(col[el]==col[n]){
                    return false;
                }
            }
        }
        return true;
    }
}