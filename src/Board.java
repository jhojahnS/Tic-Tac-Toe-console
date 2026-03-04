public class Board {

    private char[][] board;

    public Board(){
        board = new char[3][3];
        CreateBoard();
    }

    private void CreateBoard() {
        for (int i=0;i<3; i++){
            for (int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
    }

    public void printBoard(){
        for (int i=0; i<3; i++){
            System.out.println(" "+board[i][0]+ " | "+ board[i][1]+ " | "+ board[i][2]+ " ");
            if (i<2){
                System.out.println("-----------------");
            }
        }
    }

    public boolean placeMark(int row, int col, char mark){
        if(row< 0 || row >2 || col < 0 || col > 2)
            return false;
        if (board[row][col]!=' ')
            return false;

        board[row][col] = mark;
        return true;
    }

    public boolean Winner(char mark){
        for (int i=0; i<3; i++){
            if (board[i][0] == mark && board[i][1]==mark && board[i][2]==mark)
                return true;
        }
        for (int j=0; j<3; j++){
            if (board[0][j] == mark && board[1][j]==mark && board[2][j]==mark)
                return true;
        }
        if (board[0][0] == mark && board[1][1]==mark && board[2][2]==mark)
            return true;
        if (board[0][2] == mark && board[1][1]==mark && board[2][0]==mark)
            return true;

        return false;
    }
    public boolean isFull(){
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
}
