import java.util.Arrays;

public class Fibanacci {
    public static void main(String[] args) {
        int [] numbers = new int[30];
        for (int i = 2; i < 30; i++) {
            numbers[0]=1;
            numbers[1]=1;
            numbers[i]=numbers[i-1]+numbers[i-2];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
