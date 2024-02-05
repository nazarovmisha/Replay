package Speed;

public class Human implements Run,Walk{
    public static void main(String[] args) {
        System.out.println(new Human().getSpeed());
    }

    @Override
    public int getSpeed() {
        return 5;
    }
}
