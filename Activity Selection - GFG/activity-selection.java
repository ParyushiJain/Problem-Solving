//{ Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends

class pair{
    int st;
    int end;
    public pair(int st,int end){
        this.st=st;
        this.end=end;
    }
}
class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        pair[] arr=new pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new pair(start[i],end[i]);
        }
        Arrays.sort(arr,(a,b)->a.end-b.end);
        int c=1;
        int fe=arr[0].end;
        for(int i=1;i<n;i++){
            if(arr[i].st>fe){
                c++;
                fe=arr[i].end;
            }
        }
        return c;
    }
}