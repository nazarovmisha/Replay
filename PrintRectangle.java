public class PrintRectangle {
    public static void main(String[] args) {
        print(20, 5);
    }
    public static void print(int m, int n) {
        int recuss = 0;
        while (recuss < m) {
            recuss++;
            int count = 0;
            String result = "";

            while (count < n) {
                result += "8";
                count++;
            }
            System.out.println(result);
        }
    }
}

