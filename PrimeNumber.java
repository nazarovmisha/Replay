public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println(i);
            }
        }
    }
}

