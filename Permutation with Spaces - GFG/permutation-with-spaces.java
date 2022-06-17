// { Driver Code Starts
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
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    ArrayList<String> r;
    public String removeF(String s){
        String r="";
        for(int i=1;i<s.length();i++){
            r+=s.charAt(i);
        }
        return r;
    }
    ArrayList<String> permutation(String S){
        
       String op="";
       op+=S.charAt(0);
       S=removeF(S);
       r=new ArrayList();
       permute(S,op);
       return r;
    }
    public void permute(String s,String op){
        if(s.length()==0){
            r.add(op);
            return;
        }
        String op1=op+" "+s.charAt(0);
        
        String op2=op+s.charAt(0);
        s=removeF(s);
        permute(s,op1);
        permute(s,op2);
    }
    
}