class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        int[] par=new int[n];
        int[] rank=new int[n];
        for(int i=0;i<n;i++){
            par[i]=i;
            rank[i]=0;
        }
      for(int i=0;i<edges.length;i++){
          union(edges[i][0],edges[i][1],rank,par);
      }
        for(int i=0;i<n;i++){
            System.out.print(par[i]+" ");
        }
        if(findPar(s,par)==findPar(d,par)) return true;
        else return false;
    
    }
    public int findPar(int n,int[] par){
        if(n==par[n]){
            return n;
        }
        else return par[n]=findPar(par[n],par);
    }
    public void union(int u,int v,int[] rank,int[] par){
        u=findPar(u,par);
        v=findPar(v,par);
        if(rank[u] < rank[v]) {
        	par[u] = v;
        }
        else if(rank[v] < rank[u]) {
        	par[v] = u; 
        }
        else {
        	par[v] = u;
        	rank[u]++; 
        }
    }
    
}