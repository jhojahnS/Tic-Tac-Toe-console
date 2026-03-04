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
                System.out.println("|=========|");
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
}
