//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int min = (int)1e9;
        String minS = "";
        for(String t : arr) {
            min = Math.min(min,t.length());
            if(t.length()==min) minS = t;
        }
        for(int i=0;i<min;i++) {
            for(String t : arr) {
                if(t.charAt(i)!=minS.charAt(i)) return i!=0 ? minS.substring(0,i) : "-1";
            }
        }
        return minS;
    }
}