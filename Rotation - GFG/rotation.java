//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int x=bs(arr,0,arr.length-1,n);
        return x;
    }
    int bs(int arr[],int s,int e,int t){
        while(s<=e){
            int m=s+((e-s)/2);
            if(arr[m]<arr[(m+1)%arr.length] && arr[m]<arr[(m+arr.length-1)%arr.length]) return m;
            else if(arr[m]<arr[(m+1)%arr.length] && arr[m]<arr[e]) e=m-1;
            else s=m+1;
        }
        return 0;
    }
}