//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            int range[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                range[i][0]=Integer.parseInt(s[0]);
                range[i][1]=Integer.parseInt(s[1]);
            }
            int q=Integer.parseInt(in.readLine().trim());
            int Q[]=new int[q];
            String s[]=in.readLine().trim().split(" ");
            for(int i=0;i<q;i++){
                Q[i]=Integer.parseInt(s[i]);
            }

            Solution ob=new Solution();
            ArrayList<Integer> ans=ob.kthSmallestNum(n, range, q, Q);

            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    } 
}
// } Driver Code Ends


class Solution {
    static ArrayList<int[]> mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> range = new ArrayList<int[]>();
        int e = intervals[0][1];
        int s = intervals[0][0];
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] <= e) {
                e = Math.max(e,intervals[i][1]);
                s = Math.min(s,intervals[i][0]);
            }
            else {
                range.add(new int[]{s,e});
                s = intervals[i][0];
                e = intervals[i][1];
            }
        }
        range.add(new int[]{s,e});
        return range;
    }
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        // code here
        ArrayList<int[]> mat = mergeIntervals(range);
        // for(int[] t : mat) System.out.print(Arrays.toString(t) + " " );
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<q;i++) {
            int c = queries[i];
            int x = 0;
            while(x < mat.size()){
                if((mat.get(x)[1] - mat.get(x)[0] + 1) >= c) {
                     ans.add(mat.get(x)[0]+c-1);
                     c=0;
                     break;
                }
                else {
                    c-= (mat.get(x)[1] - mat.get(x)[0]+1);
                }
                x++;
            } 
           if(c>0) ans.add(-1);
        }
        return ans;
    }
}
        
