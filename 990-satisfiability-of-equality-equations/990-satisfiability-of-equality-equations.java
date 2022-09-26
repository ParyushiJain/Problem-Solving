class Solution {
    int[] parent = new int[26];
    int[] rank = new int[26];
    public boolean equationsPossible(String[] equations) {
        
        for(int i = 0;i<26;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        
        for(String s : equations){
            if(s.charAt(1)=='='){
                int a = s.charAt(0)-'a';
                int b = s.charAt(3)-'a';
                union(a,b);
            }
        }
        for(String s : equations){
            if(s.charAt(1)=='!'){
                int a = s.charAt(0)-'a';
                int b = s.charAt(3)-'a';
                int parentA = findParent(a);
                int parentB = findParent(b);
                if(parentA==parentB) return false;
                
            }
        }
        return true;
    }
    
    public int findParent(int i){
        if(i==parent[i])
            return parent[i];
        return parent[i] = findParent(parent[i]);
    }
    
    public void union(int a, int b){
        int u = findParent(a);
        int v = findParent(b);
        if(rank[u]<rank[v]){
            parent[u] = v;
        }else if(rank[v]<rank[u]){
            parent[v] = u;
        }else{
            parent[v] = u;
            rank[u]++;
        }
    }
}