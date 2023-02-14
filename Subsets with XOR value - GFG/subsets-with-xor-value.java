//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int subsetXOR(int A[], int n, int B) {
        // code here
        return sol(A,0,n,B,0);
    }
    static int sol(int[] A,int i,int n,int b,int xor){
        if(i==n&&xor==b) return 1;
        if(i>=n) return 0;
        return sol(A,i+1,n,b,xor^A[i])+sol(A,i+1,n,b,xor);
        
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            int N = s.nextInt();
            int K = s.nextInt();
            int arr[] = new int[N];
            for(int i =0;i<N;i++)
            {
                arr[i] =s.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.subsetXOR(arr,N,K));
        }
    }
}
// } Driver Code Ends