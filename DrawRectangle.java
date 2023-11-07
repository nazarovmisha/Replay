public class DrawRectangle {
    public static void main(String[] args) {
        drawRectangle(5, 6, "/");
    }

    public static void drawRectangle(int n, int m, String s) {
        int count = 1;
        StringBuilder firstString = new StringBuilder();
        StringBuilder space = new StringBuilder();
            count++;
            for (int i = 0; i < m; i++) {
                firstString.append(s);
                space.append(" ");
            }

        System.out.println(firstString);
        String secondString = s + space.substring(0, space.length() - 2) + s;

        while (count < n) {
            count++;
            System.out.println(secondString);
        }
        System.out.println(firstString);
    }
}
