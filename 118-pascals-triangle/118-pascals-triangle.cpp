class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> a;
        
        for(int i=0;i<numRows;i++){
            vector<int> rows;
          for(int j=0;j<i+1;j++){
             rows.push_back(1);
             }
            a.push_back(rows);
        }
        for(int i=2;i<numRows;i++){
            for(int j=1;j<a[i].size()-1;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        return a;
        }
};