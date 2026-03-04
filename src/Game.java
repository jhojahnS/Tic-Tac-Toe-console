import java.util.Scanner;

public class Game {

    public static void main(String []args){

        Board board= new Board();
        Scanner sc =new Scanner(System.in);

        char turn= 'X';
        while(true) {
            board.printBoard();

            System.out.println("Turno de: "+turn);
            System.out.print("Fila (1-3):");

            int row = sc.nextInt() - 1;

            System.out.println("Columna (1-3):");

            int col = sc.nextInt() - 1;

            boolean ok = board.placeMark(row, col, turn);

            if(board.Winner(turn)){
                board.printBoard();
                System.out.println("¡Gana la "+ turn +"!");
                break;
            }

            if (!ok) {
                System.out.println("Posicion invalida intentalo otra vez");
                continue;
            }


            if(turn =='X'){
                turn='O';
            }else {
                turn='X';
            }

        }
    }
}