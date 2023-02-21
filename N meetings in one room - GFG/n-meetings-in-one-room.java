// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class meet{
    int start;
    int end;
    public meet(int start,int end){
        this.start=start;
        this.end=end;
    }
}
// class itemComparator implements Comparator<meet>
// {  public int compare(meet a, meet b)
//     {
//         int r1 = a.end;
//         int r2 =b.end;
//         if(r1 < r2){
//             return -1;
//         } else if(r1 > r2) {
//             return 1;
//         }
//         return 0;
//     }
// }
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        meet[] arr=new meet[n];
        for(int i=0;i<n;i++){
            arr[i]=new meet(start[i],end[i]);
        }
        Arrays.sort(arr,new itemComparator());
        int c=1;
        int prevmeetend=arr[0].end;
        for(int i=1;i<n;i++){
            
            if(arr[i].start>prevmeetend ){
                c++;
                prevmeetend=arr[i].end;
                
            }
        }
        return c;
    }
}
