//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    // Function to return a list containing the DFS traversal of the graph.
     vector<int> r;
    vector<int> dfsOfGraph(int V, vector<int> adj[]) {
        // Code here
      
       int vis[V]={0};
       
       dfs(0,vis,adj);
       return r;
    }
    void dfs(int V, int vis[],vector<int> adj[]){
        vis[V]=1;
        r.push_back(V);
        
        for(int in:adj[V]){
            if(vis[in]!=1){
                dfs(in,vis,adj);
            }
        }
    }
};

//{ Driver Code Starts.
int main() {
    int tc;
    cin >> tc;
    while (tc--) {
        int V, E;
        cin >> V >> E;

        vector<int> adj[V];

        for (int i = 0; i < E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        // string s1;
        // cin>>s1;
        Solution obj;
        vector<int> ans = obj.dfsOfGraph(V, adj);
        for (int i = 0; i < ans.size(); i++) {
            cout << ans[i] << " ";
        }
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends