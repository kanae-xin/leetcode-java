class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> row = new HashSet<Integer>();
        HashSet<Integer> column = new HashSet<Integer>();
        HashSet<Integer> block = new HashSet<Integer>();
        HashSet<Character> check = new HashSet<Character>();

        for(int i=0; i<9;i++){
            for(int j=0; j<9;j++){
                if(0 <= board[i][j]-'0' && board[i][j]-'0' <= 9){
                    //Check row
                    if(!row.contains(i)){
                        for(int k = 0; k < 9;k++){
                            if(0 <= board[i][k]-'0' && board[i][k]-'0' <= 9)
                                if(check.contains(board[i][k])){
                                    return false;
                                }
                                else
                                    check.add(board[i][k]);
                        }
                        row.add(i);
                        check.clear();
                    }
                    //Check colunm
                    if(!column.contains(j)){
                        for(int k = 0; k < 9;k++){
                            if(0 <= board[k][j]-'0' && board[k][j]-'0' <= 9)
                                if(check.contains(board[k][j])){
                                    return false;
                                }
                                    
                                else
                                    check.add(board[k][j]);
                        }
                        check.clear();
                        column.add(j);
                    }
                    //Check block
                    if(!block.contains(i/3+j/3*3)){
                        for(int k = 0; k < 3; k++){
                            for(int l = 0; l < 3; l++){
                                if(0 <= board[i/3*3+k][j/3*3+l]-'0' && board[i/3*3+k][j/3*3+l]-'0' <= 9)
                                    if(check.contains(board[i/3*3+k][j/3*3+l])){
                                        return false;
                                    }                                        
                                    else
                                        check.add(board[i/3*3+k][j/3*3+l]);
                            }
                        }
                        check.clear();
                        block.add(i/3+j/3*3);
                    }
                }
            }
        }
        return true;
    }
}
/*
better Solution
Adding while checking
------------
public boolean isValidSudoku(char[][] board) {
    Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            char number = board[i][j];
            if (number != '.')
                if (!seen.add(number + " in row " + i) ||
                    !seen.add(number + " in column " + j) ||
                    !seen.add(number + " in block " + i/3 + "-" + j/3))
                    return false;
        }
    }
    return true;
}
*/