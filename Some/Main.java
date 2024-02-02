package Some;

public class Main {
    public static void main(String[] args) {
        int value = 70;
        validate(value, value1 -> value1 % 2 == 0);
        validate(value, value1 -> value1 >= 100);
    }

    public static void validate(int value, Validator validator) {
        System.out.println("Проверяем переданоое значение " + value);
        boolean isValid = validator.validate(value);
        if (isValid) {
            System.out.println("Отлично, значение " + value + " верно");
        } else {
            System.out.println("Значение не верно");
        }
    }
}
