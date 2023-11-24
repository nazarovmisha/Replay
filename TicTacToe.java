import java.util.Arrays;

public class TicTacToe {
    String[][] array;
    String nowPlayer;

    void newGame() {
    array=new String[3][3];
        Arrays.fill(array, "-");
     }
      String[][] getField(){
        return array;
      }

      String checkGame(){
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  if (array[i][j].equals("x")){
                      return "x";
                  }

              }
          }
      }
    }

