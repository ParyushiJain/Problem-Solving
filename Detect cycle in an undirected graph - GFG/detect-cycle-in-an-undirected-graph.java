//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] vis=new int[V];
        for(int i=1;i<V;i++){
            if(vis[i]==0){
                 if(bfs(i,vis,adj)) return true;
            }
        }
        return false;
    }
    public boolean bfs(int node,int[] vis,ArrayList<ArrayList<Integer>> adj){
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(node,-1));
        vis[node]=1;
        while(q.isEmpty()==false){
            int nd=q.peek().nd;
            int pr=q.peek().par;
            q.poll();
            for(int el:adj.get(nd)){
                if(vis[el]==0){ 
                    vis[el]=1;
                    q.add(new pair(el,nd));
                }
                else if(el!=pr) return true;
            }
        }
        return false;
    }
}
class pair{
    int nd;
    int par;
    public pair(int nd,int par){
        this.nd=nd;
        this.par=par;
    }
}