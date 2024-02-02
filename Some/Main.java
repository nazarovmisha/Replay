package Some;

public class Main {
    public static void main(String[] args) {
        int value = 70;
        validate(value, value1 -> value1 >=20);
    }

    public static void validate(int value, Validator validator) {
        System.out.println("Проверяем переданоое значение");
        boolean isValid = validator.validate(value);
        if (isValid) {
            System.out.println("Отлично, значение верно");
        } else {
            System.out.println("Значение верно");
        }
    }
}
