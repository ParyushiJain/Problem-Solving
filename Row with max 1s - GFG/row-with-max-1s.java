//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i=0;
        int j=0;
        int rc=0;
        int ans=0;
        int c=0;
        int mx=Integer.MIN_VALUE;
        while(i<n && j<m){
          
            if(arr[i][j]==1){
                c++;
                if(c>mx){
                    mx=c;
                    ans=i;
                    
                }
               
            }
            rc++; 
          j++; 
            if(rc==m){
                j=0;
                i++;
                c=0;
                rc=0;
            }
            
        }
        if(mx==Integer.MIN_VALUE) return -1;
        return ans;
    }
}