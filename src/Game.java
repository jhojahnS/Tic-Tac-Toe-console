import java.util.Scanner;

public class Game {

    public static void main(String []args){

        Board board= new Board();
        Scanner sc =new Scanner(System.in);

        char turn= 'X';
        while(true) {
            board.printBoard();

            System.out.println("Turno de: "+turn);

            int row = Validation(sc,"Fila (1-3):" );


            int col = Validation(sc,"Columna (1-3):" )-1;

            boolean ok = board.placeMark(row, col, turn);

            if(board.Winner(turn)){
                board.printBoard();
                System.out.println("Gana la "+ turn);
                break;
            }

            if (board.isFull()){
                board.printBoard();
                System.out.println("Empate");
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

    private static int Validation(Scanner sc, String mensaje){
        while(true){
            System.out.println(mensaje);
            if(sc.hasNextInt()){
                return sc.nextInt();
            }
            sc.next();
            System.out.println("Dato no valido, intentelo otra vez");
        }
    }
}