//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> ans;
    static HashMap<Integer,String> hm;
    static void fun(int N, int[] a, String k, int i) {
        if(k.length()==N) {
            ans.add(new String(k));
        }
        else if(i>=a.length) return;
        else {
            for(char x : hm.get(a[i]).toCharArray()) {
                k = k+x;
                fun(N,a,k,i+1);
                k = k.substring(0,k.length()-1);
            }
        }
    }
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        hm = new HashMap<Integer,String>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        ans = new ArrayList<String>();
        fun(N,a,"",0);
        return ans;
    }
}


