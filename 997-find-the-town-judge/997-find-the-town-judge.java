class Solution {
    public int findJudge(int n, int[][] trust) {
       ArrayList<ArrayList<Integer>> adj=new ArrayList();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList());
        }
        for(int i=0;i<trust.length;i++){
            adj.get(trust[i][0]).add(trust[i][1]);
        }
        
        for(int i=1;i<=n;i++){
            if(adj.get(i).size()==0){
                if(check(i,adj)) return i;
            }
        }
        return -1;
    }
    public boolean check(int i,ArrayList<ArrayList<Integer>> adj){
        for(int j=1;j<adj.size();j++){
            if(j!=i){
                if(!adj.get(j).contains(i)) return false;
            }
        }
        return true;
    }
}