//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.findLeastGreater(n, arr);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends

class Node {
    Node left;
    Node right;
    int data;
    Node(int d) {
        this.data = d;
        left = null;
        right = null;
    }
}
class Tree {
    Node root;
    int searchGreater(Node node,int v) {
        if(root==null) return -1;
        if(node.data <= v) {
            if(node.right==null) return -1;
            return searchGreater(node.right,v);
        }
        else if(node.data > v) {
            if(node.left==null) return node.data;
            else {
              int x = searchGreater(node.left,v);
              if(x > v) return x;
              else return node.data;
            }
        }
        else return -1;
    }
    void insert(Node node, int v) {
        if(node==null) {
            this.root = new Node(v);
        }
        else if(node.data < v) {
            if(node.right==null) node.right = new Node(v);
            else insert(node.right,v);
        }
        else {
            if(node.left==null) node.left = new Node(v);
            else insert(node.left,v);
        }
    }
}
class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        Tree tree = new Tree();
        for(int i=n-1;i>=0;i--) {
            int k = tree.searchGreater(tree.root, arr[i]);
            tree.insert(tree.root,arr[i]);
            arr[i] = k;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i : arr) ans.add(i);
        return ans;
    }
}
        
