class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int m[][]=new int [target+1][n+1], mod=1000000007;
        for(int i=1; i<=n; i++) m[0][i]=0;
        for(int i=1; i<=target; i++) m[i][0]=0;
        m[0][0]=1;
        
        for(int i=1; i<m.length; i++)
        {
            for(int j=1; j<m[i].length; j++)
            {
                for(int l=1; l<=k; l++)
                    if(i-l>-1) m[i][j]=m[i][j]%mod + m[i-l][j-1]%mod;
            }
        }
        
        return m[target][n]%mod;
    }
}