//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

class pair{
    int n;
    int d;
    public pair(int n,int d){
        this.n=n;
        this.d=d;
    }
}

class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(src,0));
        while(q.isEmpty()==false){
            int nd=q.peek().n;
            int dt=q.peek().d;
            q.poll();
            for(int i:adj.get(nd)){
                if(dt+1<dist[i]){
                dist[i]=Math.min(dist[i],dt+1);
                q.add(new pair(i,dist[i]));
                }
            }
        }
        for(int i=0;i<n;i++){
            if(dist[i]==Integer.MAX_VALUE) dist[i]=-1;
        }
        return dist;
    }
}