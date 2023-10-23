import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Будем загадывать число от ...");
        Scanner scanner1=new Scanner(System.in);
        int min=scanner1.nextInt();

        System.out.println("До...");
        Scanner scanner2 = new Scanner(System.in);
        int max = scanner2.nextInt();

        System.out.println("Сколько попыток?");

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();

    }

    public static void guess() {

    }

}
