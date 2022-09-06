class Solution {
    public boolean isValidSudoku(char[][] board) {
       
            System.out.print(checkRow(board)+" "+checkCol(board)+" "+checkBox(board));
            if(!checkRow(board)) return false;
            if(!checkCol(board)) return false;
            
        
        if(!checkBox(board)) return false;
        return true;
        
    }
    public boolean checkBox(char[][] board){
       for(int i=0;i<9;i+=3){
           for(int j=0;j<9;j+=3){
               HashSet<Character> hs=new HashSet();
                for(int a = i,count = 0 ; count < 3; count ++,a++){
                    for(int k = j,cnt = 0; cnt < 3; cnt ++,k++){
                        if(board[a][k] == '.'){
                            continue;
                        }
                        if(hs.contains(board[a][k])){
                            return false;
                        }else{
                            hs.add(board[a][k]);
                        }
                    }
                }
               
           }
       }
        return true;
    }
    public boolean checkRow(char[][] board){
        
        for(int i=0;i<9;i++){
             HashSet<Character> hs=new HashSet();
            for(int j=0;j<9;j++){
          
            if(board[i][j]!='.'){
               if(hs.contains(board[i][j])) return false;
                else hs.add(board[i][j]);
            }
            }
        }
         
        return true;
    }
    public boolean checkCol(char[][] board){
        for(int i=0;i<9;i++){
             HashSet<Character> hs=new HashSet();
            for(int j=0;j<9;j++){
          
            if(board[j][i]!='.'){
               if(hs.contains(board[j][i])) return false;
                else hs.add(board[j][i]);
            }
            }
        }
         
        return true;
    }
}