import java.util.Arrays;
import java.util.TooManyListenersException;

public class TicTacToe {
    String[][] array;
    String nowPlayer;

    void newGame() {
        array = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j]="x";
            }
        }
       for (String[] i:array){


       }
    }

    String[][] getField() {
        return array;
    }

    String checkGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j].equals("x")) {
                    return "x";
                }

            }
        }return "a";
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.newGame();

    }
}


