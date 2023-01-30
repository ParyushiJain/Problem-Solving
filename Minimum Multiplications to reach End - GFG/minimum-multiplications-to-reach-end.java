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
    int n;
    int d;
    public pair(int n,int d){
        this.n=n;
        this.d=d;
    }
}
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        int[] arrd=new int[100000];
        Arrays.fill(arrd,Integer.MAX_VALUE);
        arrd[start]=0;
        Queue<pair> q=new LinkedList();
        q.add(new pair(start,0));
        while(q.isEmpty()==false){
            int nd=q.peek().n;
            int ds=q.peek().d;
            
            q.poll();
            for(int i:arr){
                int nm=(nd*i)%100000;
                if(nm==end) return ds+1;
                if(ds+1<arrd[nm]){
                    arrd[nm]=ds+1;
                    q.add(new pair(nm,ds+1));
                }
            }
        }
       return -1;
        
    }
}
