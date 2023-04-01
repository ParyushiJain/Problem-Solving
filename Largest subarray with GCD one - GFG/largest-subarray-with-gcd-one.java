//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargestSubarray(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    static int findLargestSubarray(int arr[], int n)
    {
        // code here
        int g=arr[0];
        for(int i=1;i<n;i++){
            g=gcd(g,arr[i]);
        }
        if(g==1) return n;
        else return -1;
    }
    public static int gcd(int a ,int b){
        if (b == 0)
        return a;
      return gcd(b, a % b);
    }
}