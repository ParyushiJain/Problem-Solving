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
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int l=-1;
    int r=-1;
    int count(int[] arr, int n, int x) {
        // code here
        binf(arr,0,arr.length-1,x);
        binl(arr,0,arr.length-1,x);
        if(l==-1) return 0;
        else return (r-l+1);
    }
     public void binf(int a[],int s,int e,int t){
       
        while(s<=e){
             int m=s+((e-s)/2);
        if(a[m]<t){
           s=m+1;
        }
        else if(a[m]>t){
            e=m-1;
        }
        else{
          l=m;
          e=m-1;
          
         
        }
        
        }
       return;
        
    }
     public void binl(int a[],int s,int e,int t){
       
        while(s<=e){
             int m=s+((e-s)/2);
        if(a[m]<t){
           s=m+1;
        }
        else if(a[m]>t){
            e=m-1;
        }
        else{
          r=m;
          s=m+1;
          
         
        }
        
        }
       return;
        
    }
}