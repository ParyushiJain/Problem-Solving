//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        int[] vis=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0) dfs(i,vis,adj,st);
        }
        ArrayList<ArrayList<Integer>> adjT=new ArrayList<>();
        for(int i=0;i<V;i++){
            adjT.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            vis[i]=0;
            for(int el:adj.get(i)){
                adjT.get(el).add(i);
            }
        }
        int scc=0;
        while(!st.isEmpty()){
            int n=st.pop();
            if(vis[n]==0){
                scc++;
                dfsT(n,vis,adjT);
                
            }
        }
        return scc;
        
        
        
    }
    public void dfsT(int node,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(int el:adj.get(node)){
            if(vis[el]==0) dfsT(el,vis,adj);
        }
    }
    public void dfs(int node,int[] vis,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st){
        vis[node]=1;
        for(int el:adj.get(node)){
            if(vis[el]==0) dfs(el,vis,adj,st);
        }
        st.push(node);
    }
    
}
