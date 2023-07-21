//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String arr[] = in.readLine().trim().split("\\s+");
            int S = Integer.parseInt(arr[0]);
            int N = Integer.parseInt(arr[1]);
            int M = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.minimumDays(S, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumDays(int S, int N, int M){
        // code here
        int noOfSundays=S/7;
        int canBuy=S-noOfSundays;
        int foodNeeded=S*M;
        int foodUnitCanBuy=N*canBuy;
        if(foodUnitCanBuy<foodNeeded) return -1;
        int bought=0;
        int ans=0;
        while(bought<foodNeeded){
            bought+=(N);
            ans++;
        }
        return ans;
        
    }
}