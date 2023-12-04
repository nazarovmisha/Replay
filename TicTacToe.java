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
        String[] horizontal1 = {array[0][0], array[0][1], array[0][2]};
        String[] horizontal2 = {array[1][0], array[1][1], array[1][2]};
        String[] horizontal3 = {array[2][0], array[2][1], array[2][2]};
        String[] vertical1 = {array[0][0], array[1][0], array[2][0]};
        String[] vertical2 = {array[0][1], array[1][1], array[2][1]};
        String[] vertical3 = {array[0][2], array[1][2], array[2][2]};
        String[] diagonal = {array[0][0], array[1][1], array[2][2]};
        String[] diagonal2 = {array[0][2], array[1][1], array[2][0]};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (!horizontal1[i].equals("x") || !horizontal2[i].equals("x") ||! horizontal3[i].equals("x") ||! vertical1[i].equals("x")
                        || !vertical2[i].equals("x") || !vertical3[i].equals("x") || !diagonal[i].equals("x") || !diagonal2[i].equals("x")
                ||!horizontal1[i].equals("-") || !horizontal2[i].equals("-") || !horizontal3[i].equals("-") || !vertical1[i].equals("-")
                        || !vertical2[i].equals("-") || !vertical3[i].equals("-") || !diagonal[i].equals("-") || !diagonal2[i].equals("-")) {
                    System.out.println("0 win");
                    return false;
                } else if (!horizontal1[i].equals("0") || !horizontal2[i].equals("0") || !horizontal3[i].equals("0") || !vertical1[i].equals("0")
                        || !vertical2[i].equals("0") || !vertical3[i].equals("0") || !diagonal[i].equals("0") || !diagonal2[i].equals("0")||
                        !horizontal1[i].equals("-") || !horizontal2[i].equals("-") || !horizontal3[i].equals("-") || !vertical1[i].equals("-")
                        || !vertical2[i].equals("-") || !vertical3[i].equals("-") || !diagonal[i].equals("-") || !diagonal2[i].equals("-"))
                        {
                    System.out.println("x win");
                    return false;
                } else if (!array[i][j].equals("-")) {
                    System.out.println("Draw!");
                    return false;

                }
            }
        }
        return true;
    }

    void makeMove(int x, int y) {
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
    }
}



