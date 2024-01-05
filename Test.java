import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
            int a = scanner.nextInt();
                list.add(a);
            } catch (InputMismatchException e) {
                System.out.println("Это не число");
                System.out.println(list);
            }

        }
    }
}
