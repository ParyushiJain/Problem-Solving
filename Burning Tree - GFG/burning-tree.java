//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    public static void mark(Node root,HashMap<Node,Node> par){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            if(curr.left!=null){
                par.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                par.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        HashMap<Node,Node> par=new HashMap<>();
        mark(root,par);
        HashSet<Node> vis=new HashSet<>();
        int d=0;
        Node tar=find(root,target);
        vis.add(tar);
        
        Queue<Node> q=new LinkedList<>();
        q.offer(tar);
        while(q.isEmpty()==false){
            d++;
            int qs=q.size();
            for(int i=0;i<qs;i++){
                Node curr=q.poll();
               
                 if(curr.left!=null && vis.contains(curr.left)==false){
                    vis.add(curr.left);
                    q.offer(curr.left);
                }
                if(curr.right!=null && vis.contains(curr.right)==false){
                    vis.add(curr.right);
                    q.offer(curr.right);
                }
               
                if(par.get(curr)!=null && vis.contains(par.get(curr))==false){
                    vis.add(par.get(curr));
                    q.offer(par.get(curr));
                }
            }
           
        }
        return d-1;
        
    }
    public static Node find(Node root,int target){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(q.isEmpty()==false){
            int s=q.size();
            for(int i=0;i<s;i++){
                Node curr=q.poll();
                if(curr.data==target) return curr;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return root;
    }
}