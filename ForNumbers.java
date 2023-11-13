public class ForNumbers {
    public static void main(String[] args) {
        int i = 1;
        int j = -2;
        while (i < 100) {
            System.out.print(i + " ");
            System.out.print(j + " ");
            i += 2;
            j -= 2;
        }
    }
}
