import java.util.Arrays;

public class Control {
    public static void main(String[] args) {


        int[][] points = {
                {5, 4, 5, 4, 5},
                {5, 5, 5, 5, 5},
                {2, 3, 4, 5, 5},
                {2, 3, 2, 3, 2},
                {2, 5, 5, 5, 5}
        };
        String[] result = new String[5];
        String[] names = {"Alex", "Mike", "Roman", "Dima", "Ilya" };
        int[] sumPoints = new int[5];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                sumPoints[i] += points[i][j];
            }
            result[i]=names[i] + " " + sumPoints[i];

        }
        System.out.println(Arrays.toString(result));
    }
}
