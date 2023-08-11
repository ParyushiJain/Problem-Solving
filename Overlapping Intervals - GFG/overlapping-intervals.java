//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] intervals)
    {
        // Code here // Code here
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        ArrayList<int[]> ans = new ArrayList<int[]>();
        int i=0;
        while(i<intervals.length) { 
            int s = intervals[i][0];
            int e = intervals[i][1];
            i++;
            while(i<intervals.length && intervals[i][0] <= e) {
                s = Math.min(s, intervals[i][0]);
                e = Math.max(e, intervals[i][1]);
                i++;
            }
            ans.add(new int[]{s,e});
        }
        int[][] arr = new int[ans.size()][2];
        int j = 0;
        for(int[] t : ans) arr[j++] = t;
        return arr;
    }
}