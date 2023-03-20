//{ Driver Code Starts
import java.util.*;

class suffix
{
     int index;  
    int rank[] = new int[2];
}

class UniqueSubStr
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            GfG g = new GfG();
            System.out.println(g.countDistinctSubstring(st));
        }
    }
}
// } Driver Code Ends


/*You are required to complete this method */
class GfG
{
   public static int countDistinctSubstring(String st)
   {
       //your code here
       int c=0;
       Node root=new Node();
       for(int i=0;i<st.length();i++){
           Node node=root;
           for(int j=i;j<st.length();j++){
               if(node.contains(st.charAt(j))==false){
                   c++;
                   node.put(st.charAt(j),new Node());
                   
               }
               node=node.get(st.charAt(j));
           }
       }
       return c+1;
      

   }
}
class Node{
     Node[] links=new Node[26];
    public  boolean contains(char c){
        return (links[c-'a']!=null);
    }
    public  Node get(char c){
        return links[c-'a'];
    }
    public  void put(char c,Node node){
        links[c-'a']=node;
    }
}