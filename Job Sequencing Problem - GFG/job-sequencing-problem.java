//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
       Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int jd=0;
        int pr=0;
        int mx=0;
        for(Job i:arr){
            mx=Math.max(mx,i.deadline);
        }
        int[] dl=new int[mx+1];
        Arrays.fill(dl,-1);
        for(int i=0;i<n;i++){
            int d=arr[i].deadline;
            for(int j=d;j>0;j--){
            if(dl[j]==-1){
                dl[j]=i;
                jd++;
                pr+=arr[i].profit;
                break;
            }
            }
        }
        int[] r=new int[2];
        r[0]=jd;
        r[1]=pr;
        return r;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/