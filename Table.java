public class Table {
    public static void main(String[] args) {
        table(5);

    }

    public static void table(int n) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" " + i * j + " ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "*" + n + "="+i * n);
        }
    }
}
