import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Будем загадывать число от ...");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();

        System.out.println("До...");
        int max = scanner.nextInt();

        System.out.println("Сколько попыток?");
        int attempts = scanner.nextInt();

        guess(min, max, attempts);
    }

    public static void guess(int min, int max, int attempts) {
        int count = 0;
        int remainingAttempts = attempts;
        int hiddenNumber = (int) ((Math.random() * (max - min)) + min);
        System.out.println(hiddenNumber);
        while (count < attempts) {
            count++;
            remainingAttempts--;
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);

            int userInt = scanner.nextInt();
            if (hiddenNumber < userInt) {
                System.out.println("Я загадал меньшее число");
                System.out.println("Осталось попыток " + remainingAttempts);

            } else if (hiddenNumber > userInt) {
                System.out.println("Я загадал большее число");
                System.out.println("Осталось попыток " + remainingAttempts);

            } else {
                System.out.println("Угадал");
                break;
            }
        }
        System.out.println("Загаданное число " + hiddenNumber);
    }
}
