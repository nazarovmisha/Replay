import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    String[][] array;
    int nowPlayer;

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.newGame();
        boolean check = true;
        while (check) {
            System.out.println("Куда сходим?");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ticTacToe.makeMove(x, y);
            check = ticTacToe.checkGame();
            ticTacToe.getField();
        }
    }

    void newGame() {
        array = new String[3][3];
        nowPlayer = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = "-";
            }
        }
    }


    void getField() {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
        System.out.println();
    }

    boolean checkGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i=" + i + " j=" + j);
                if (array[i][j].equals("0") || array[j][i].equals("-")) {
                    System.out.println("x win");
                    return true;
                } else if (array[j][i].equals("0") || array[j][j].equals("-")) {
                    System.out.println("x win");

                }else if(array[i][i].equals("0")||array[i][i].equals("-")){
                    System.out.println("x win");
                }
            }
        }return false;
    }

    String makeMove(int x, int y) {

        if (array[x - 1][y - 1].equals("x") || array[x - 1][y - 1].equals("0")) {
            System.out.println("Cell" + "[" + x + "]" + "[" + y + "] is already occupied, сходи по-другому");
            Scanner scanner = new Scanner(System.in);
            int z = scanner.nextInt();
            int z1 = scanner.nextInt();
            this.makeMove(z, z1);

        } else {
            if (nowPlayer % 2 == 0) {
                array[x - 1][y - 1] = "x";
            } else {
                array[x - 1][y - 1] = "0";
            }
        }
        nowPlayer++;
        return "a";
    }
}


