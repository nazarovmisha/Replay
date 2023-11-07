import java.util.Scanner;

public class CheckName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] array =
                name.split(" ");
        if (array.length == 3) {
            return true;
        } else {
            return false;
        }
    }

    private static String formatName(String name) {
        String[] array = name.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);


        }
        return String.join(" ", array);
    }
}


