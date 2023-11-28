import java.util.Arrays;
import java.util.TooManyListenersException;

public class TicTacToe {
    String[][] array;
    int nowPlayer;

    void newGame() {
        array = new String[3][3];
        nowPlayer = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = "-";
            }
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
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
        }
        return "a";
    }

    void makeMove(int x, int y) {
        if (array[x - 1][y - 1].equals("X") || array[x - 1][y - 1].equals("0")) {
            System.out.println("Cell" + "[" + x + "]" + "[" + y + "] is already occupied");

        } else {
            if (nowPlayer % 2 == 0) {
                array[x - 1][y - 1] = "x";
            } else {
                array[x - 1][y - 1] = "y";
            }
        }
        nowPlayer++;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.newGame();
    }
}


