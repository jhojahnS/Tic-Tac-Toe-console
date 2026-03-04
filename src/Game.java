import java.util.Scanner;

public class Game {

    public static void main(String []args){

        Board board= new Board();
        Scanner sc =new Scanner(System.in);

        board.printBoard();

        System.out.print("Fila (1-3):");

        int row = sc.nextInt()-1;

        System.out.println("Columna (1-3):");

        int col = sc.nextInt()-1;

        boolean ok = board.placeMark(row,col, 'X');

        if (!ok){
            System.out.println("Posicion invalida");
        }

        board.printBoard();
    }
}