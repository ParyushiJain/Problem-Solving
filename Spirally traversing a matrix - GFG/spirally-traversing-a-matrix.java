//{ Driver Code Starts
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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int rt, int c)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int l=0;
        int r=c-1;
        int t=0;
        int b=rt-1;
        int dir=0;
        while(l<=r && t<=b){
            if(dir==0){
                for(int i=l;i<=r;i++){
                    ans.add(matrix[t][i]);
                   
                }
                t++;
                
            }
            else if(dir==1){
                for(int i=t;i<=b;i++){
                    ans.add(matrix[i][r]);
                }
                r--;
            }
            else if(dir==2){
                for(int i=r;i>=l;i--){
                    ans.add(matrix[b][i]);
                }
                b--;
            }
            else if(dir==3){
                for(int i=b;i>=t;i--){
                    //System.out.println(l+" "+i+" "+matrix[l][i]);
                    //System.out.println();
                    ans.add(matrix[i][l]);
                }
                l++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }
}
