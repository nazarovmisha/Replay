public class SyracuseSequence {
    public static void main(String[] args) {
syracuseSequence(10);
    }
    public static void syracuseSequence(int number) {
        int count = 0;
        String result = "";
        while (number > 1) {
            count++;
            if (number % 2 == 0) {
                number /= 2;
                result += number + " -> ";
            } else {
                number = 3 * number + 1;
                result += number + " -> ";
            }
        }
        System.out.println(count);
        System.out.println(result);
    }
}

