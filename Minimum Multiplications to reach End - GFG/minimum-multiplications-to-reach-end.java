//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
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
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        int[] dis=new int[100000];
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(start,0));
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[start]=0;
        while(q.isEmpty()==false){
            int n=q.peek().nd;
            int d=q.peek().dist;
            if(n==end) return d;
            q.poll();
            for(int i:arr){
                if(d+1<dis[(n*i)%100000]){
                    dis[(n*i)%100000]=d+1;
                    q.add(new pair(((n*i)%100000),d+1));
                }
            }
        }
        return -1;
    }
}
