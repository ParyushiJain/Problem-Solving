//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class pair{
    int n;
    int d;
    public pair(int n,int d){
        this.n=n;
        this.d=d;
    }
}
class Solution {
    
	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		ArrayList<ArrayList<pair>> adj=new ArrayList<>();
		for(int i=0;i<N;i++){
		    adj.add(new ArrayList<>());
		}
		for(int i=0;i<edges.length;i++){
		    adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
		}
		Stack<Integer> st=new Stack<>();
		int[] dist=new int[N];
		Arrays.fill(dist,Integer.MAX_VALUE);
		int src=0;
		int[] vis=new int[N];
		dist[src]=0;
		dfs(src,vis,adj,st);
		while(st.isEmpty()==false){
		    int t=st.pop();
		    for(pair i:adj.get(t)){
		        int in=i.n;
		        int wt=i.d;
		        dist[in]=Math.min(dist[in],dist[t]+wt);
		    }
		}
		for(int i=0;i<N;i++){
		    if(dist[i]==Integer.MAX_VALUE) dist[i]=-1;
		}
		return dist;
	}
	public void dfs(int node,int[] vis,ArrayList<ArrayList<pair>> adj,Stack<Integer> st){
	    vis[node]=1;
	    for(pair i:adj.get(node)){
	        int in=i.n;
	        if(vis[in]==0){
	            dfs(in,vis,adj,st);
	        }
	    }
	    st.push(node);
	}
}