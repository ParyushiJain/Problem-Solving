// { Driver Code Starts

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.safePos(n,k));
        }
    }
}// } Driver Code Ends



class Solution {
    static ArrayList<Integer> al;
    static int safePos(int n, int k) {
        if(n==1){
            return 1;
        }
        al=new ArrayList(); 
        for(int i=0;i<n;i++){
            
            al.add(i+1);
        } 
       solve(al,k-1,0);
       
      
       return al.get(0);
    }
    public static void solve(ArrayList<Integer> al,int k,int id){
        if(al.size()==1 ){
            
            return;
        }
     id=((id+k)%al.size());
        al.remove(id);
       
        solve(al,k,id);
        
    }
};