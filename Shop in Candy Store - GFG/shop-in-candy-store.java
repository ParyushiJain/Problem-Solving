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
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int arr[],int N,int k){
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int mnc=0;
        while(i<=j){
            mnc+=arr[i];
            i++;
            j-=k;
        }
        ArrayList<Integer> al=new ArrayList<>();
        al.add(mnc);
        int[] r=new int[N];
        for(int y=0;y<N;y++){
            r[y]=arr[N-y-1];
        }
        i=0;
        j=arr.length-1;
        int mxc=0;
        while(i<=j){
            mxc+=r[i];
            i++;
            j-=k;
        }
        al.add(mxc);
        return al;
        
    }
}