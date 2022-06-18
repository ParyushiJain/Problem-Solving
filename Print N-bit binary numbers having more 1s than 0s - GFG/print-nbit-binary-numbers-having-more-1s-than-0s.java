// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> al;
    ArrayList<String> NBitBinary(int N) {
       al=new ArrayList();
       int o=0;
       int z=0;
       String op="";
       solve(o,z,N,op);
       return al;
    }
    public void solve(int o,int z,int n,String op){
        if(n==0){
            al.add(op);
            return;
        }
        String op2="1";
            op2=op+op2;
          solve(o+1,z,n-1,op2);   
        if(o>z){
            String op1="0";
            op1=op+op1;
          solve(o,z+1,n-1,op1);  
        }
       
    }
}