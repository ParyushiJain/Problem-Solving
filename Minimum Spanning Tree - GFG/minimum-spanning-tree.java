//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java
class pair{
    int nd;
    int dist;
    public pair(int nd,int dist){
        this.nd=nd;
        this.dist=dist;
    }
}
class Pair{
    int wt;
    int nd;
    int par;
    public Pair(int wt,int nd,int par){
        this.wt=wt;
        this.nd=nd;
        this.par=par;
    }
}
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    ArrayList<ArrayList<pair>> adj=new ArrayList<>();
	    for(int i=0;i<V;i++){
	        adj.add(new ArrayList<>());
	    }
	    for(int i=0;i<edges.length;i++){
	        adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
	        adj.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));
	    }
	    int[] vis=new int[V];
	    PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.wt-y.wt);
	    pq.add(new Pair(0,0,-1));
	    int sm=0;
	    while(!pq.isEmpty()){
	        int w=pq.peek().wt;
	        int n=pq.peek().nd;
	        int pr=pq.peek().par;
	        pq.poll();
	        if(vis[n]==1) continue;
	        vis[n]=1;
	        sm+=w;
	        for(pair p:adj.get(n)){
	            int an=p.nd;
	            int aw=p.dist;
	            if(vis[an]==0){
	                pq.add(new Pair(aw,an,n));
	            }
	        }
	    }
	    return sm;
	    
	}
}