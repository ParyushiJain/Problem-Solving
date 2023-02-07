//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to return Breadth First Traversal of given graph.
    ArrayList<Integer> r=new ArrayList<>();
    HashSet<Integer> hs=new HashSet<>();
    int timer=1;
    public void dfs(int node,int par,int[] vis,int[] tin,int[] low,ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        tin[node]=low[node]=timer++;
        int child=0;
        for(int el:adj.get(node)){
           
            if(el==par) continue;
            if(vis[el]==0){
                dfs(el,node,vis,tin,low,adj);
                low[node]=Math.min(low[node],low[el]);
                if(low[el]>=tin[node] && par!=-1) hs.add(node);
                 child++;
            }
            else{
                low[node]=Math.min(low[node],tin[el]);
            }
        }
        if(child>1 && par==-1) hs.add(node);
    }
    
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        int[] vis=new int[V];
        int[] tin=new int[V];
        int[] low=new int[V];
        
        dfs(0,-1,vis,tin,low,adj);
        if(hs.size()==0) {
            r.add(-1);
            return r;
        }
        for(int i:hs) r.add(i);
        Collections.sort(r);
        return r;
        
    }
}