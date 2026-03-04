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
                System.out.println("==============");
            }
        }
    }
}
