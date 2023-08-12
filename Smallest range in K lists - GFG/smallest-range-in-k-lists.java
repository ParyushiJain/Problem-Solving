//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class DriverClass
{
	public static void main(String args[]) 
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   int range[];
	   while(t-- >0)
	   {
	     int n = sc.nextInt();
	     int k = sc.nextInt();
	     int arr[][] = new int[k][n];
	       for(int i = 0; i < k; i++)
	       {
	        for(int j = 0; j < n; j++)
	               arr[i][j] = sc.nextInt();
	       }
	       range = new Solution().findSmallestRange(arr, n, k);
	       System.out.println(range[0] + " " + range[1]);
	   }
	}
}

// } Driver Code Ends


class Solution
{
	static int[] findSmallestRange(int[][] mat,int n,int k)
	{
	    //add your code here
	    PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[0]-b[0]);
	    int min = (int)1e5, max = -(int)1e5;
	    for(int i=0;i<k;i++) {
	        min = Math.min(min,mat[i][0]);
	        max = Math.max(max,mat[i][0]);
	        pq.add(new int[]{mat[i][0],i,1});
	    }
	    int low = min;
	    int high = max;
	    while(!pq.isEmpty()) {
	        int[] el = pq.poll();
	        min = el[0];
	        if(max - min < high - low) {
	            high = max;
	            low = min;
	        }
	        if(el[2]<n) {
	            max = Math.max(mat[el[1]][el[2]], max);
	            pq.add(new int[]{mat[el[1]][el[2]],el[1],el[2]+1});
	        }
	        else break;
	    }
	    return new int[]{low, high};
	}
}