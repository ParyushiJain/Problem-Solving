class Solution {
    public boolean equationsPossible(String[] e) {
        int[] p=new int[26];
        int[] r=new int[26];
        for(int i=0;i<26;i++){
            r[i]=0;
            p[i]=i;
        }
        for(int i=0;i<e.length;i++){
            if(e[i].charAt(1)=='='){
                union(e[i].charAt(0)-97,e[i].charAt(3)-97,r,p);
            }
            
        }
         for(int i=0;i<e.length;i++){
            if(e[i].charAt(1)=='!'){
             
                if(find(e[i].charAt(0)-97,p)==find(e[i].charAt(3)-97,p)) return false;
            
            }
            
        }
    
        return true;
        
    }
    public int find(int u,int[] p){
     
       
        if(u==p[u]) return u;
        return p[u]=find(p[u],p);
    }
    public void union(int u,int v,int[] r,int par[]){
       
        u=par[u];
        v=par[v];
        if(r[u]>r[v]){
            par[v]=u;
        }
        else if(r[v]>r[u]){
        par[u]=v; 
        }
        else{
            par[v]=u;
             r[u]++;
        }
    }
}