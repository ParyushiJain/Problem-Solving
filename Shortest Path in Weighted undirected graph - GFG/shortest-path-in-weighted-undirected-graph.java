//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
@SuppressWarnings("unchecked") class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int edges[][] = new int[m][3];
            for (int i = 0; i < m; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
                edges[i][2] = sc.nextInt();
            }
            Solution obj = new Solution();
            List<Integer> ans = obj.shortestPath(n, m, edges);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class pair{
    int node;
    int dist;
    public pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        // code here
         ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
       
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
        
            adj.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));

        }
        int[] par=new int[n+1];
        int[] disArr=new int[n+1];
        for(int i=1;i<=n;i++){
            par[i]=i;
            disArr[i]=Integer.MAX_VALUE;
        }
        
        PriorityQueue<pair> pq=new PriorityQueue<pair>((x,y)->x.dist-y.dist);
        pq.add(new pair(1,0));
        disArr[1]=0;
        while(!pq.isEmpty()){
            int nd=pq.peek().node;
            int d=pq.peek().dist;
            pq.poll();
            for(pair p:adj.get(nd)){
                int np=p.node;
                int dp=p.dist;
                if(dp+d<disArr[np]){
                    disArr[np]=d+dp;
                    pq.add(new pair(np,disArr[np]));
                    par[np]=nd;
                }
            }
        }
        
        List<Integer> r=new ArrayList<>();
        if(disArr[n]==Integer.MAX_VALUE){
            r.add(-1);
            return r;
            
        }
        int el=n;
        while(par[el]!=el){
            r.add(el);
            el=par[el];
        }
        r.add(1);
        Collections.reverse(r);
        return r;
        
    }
}