// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> al;
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        al=new ArrayList<Integer>();
        int s=0;
        solve(arr,s);
        return al;
    }
    public void solve(ArrayList<Integer> arr,int s){
        if(arr.size()==0){
            al.add(s);
            return;
        }
        int s1=s;
        int s2=s+arr.get(0);
        ArrayList<Integer> ip=new ArrayList<Integer>(arr);
        ip.remove(0);
        solve(ip,s1);
        solve(ip,s2);
    }
}