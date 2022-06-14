// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    public static int findmax(double[] a){
        double max=a[0];
        int idx=0;
        
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                idx=i;
            }
        }
        return idx;
    }
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        
       double[] fr=new double[arr.length];
       for(int i=0;i<arr.length;i++){
           fr[i]=Double.valueOf(arr[i].value)/Double.valueOf(arr[i].weight);
       }
       
      
       double mw=W;
       double sm=0;
       double[] r=new double[n];
       while(mw>=0 ){
           int ind=findmax(fr);
           if(arr[ind].weight<=mw){
               sm+=Double.valueOf(arr[ind].value);
           }
           else{
             
              double wi=Double.valueOf(arr[ind].weight);
               sm=sm+((mw/wi)*Double.valueOf(arr[ind].value));
           }
           fr[ind]=0;
           arr[ind].value=0;
           mw=mw-arr[ind].weight;
       }
       
      return sm;
      
     
       
       
    }
}