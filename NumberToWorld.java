public class NumberToWorld {
    public static void main(String[] args) {
numberToWorld(1000);
    }

    public static void numberToWorld(int number) {
        int count = 0;
        while (number >= 10) {
            number/=10;
            System.out.println(number);
            count++;
        }
        if (number % 2 == 0 && count == 0) {
            System.out.println("even single digit number");
        } else if (number % 2 != 0 && count == 0) {
            System.out.println("odd single digit number");
        } else if (number % 2 == 0 && count == 1) {
            System.out.println("even two-digit number");
        } else if (number % 2 != 0 && count == 1) {
            System.out.println("odd two-digit number");
        } else if (number % 2 == 0 && count == 2) {
            System.out.println("even three-digit number");
        } else if(number%2!=0&&count==2){
            System.out.println("odd three-digit number");
        }else {
            System.out.println("!");
        }
    }
}
