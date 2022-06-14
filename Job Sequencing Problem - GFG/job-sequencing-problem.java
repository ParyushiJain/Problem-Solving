// { Driver Code Starts
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
}// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    class itemComparator implements Comparator<Job>
{
      public int compare(Job a, Job b)
    {
        int r1 = a.profit;
        int r2 = b.profit;
        if(r1 > r2){
            return -1;
        } else if(r1 < r2) {
            return 1;
        }
        return 0;
    }
}
public static int max(Job arr[]){
    int max=arr[0].deadline;
    for(int i=1;i<arr.length;i++){
        if(arr[i].deadline>max){
            max=arr[i].deadline;
        }
    }
    return max;
}
    int[] JobScheduling(Job arr[], int n)
    {
        int r[]=new int[2];
        r[0]=0;
        r[1]=0;
      Arrays.sort(arr,new itemComparator()); 
      int maxd=max(arr);
      int[] slot=new int[maxd];
     
      for(int i=0;i<arr.length;i++){
          int t=arr[i].deadline-1;
          while(t>=0){
              if(slot[t]!=1){
                  slot[t]=1;
                  r[0]++;
                  r[1]+=arr[i].profit;
                  break;
              }
              t--;
          }
          
      }
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