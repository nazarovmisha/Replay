public class IsPow {
    public static void isPow(int n) {
        int count = 0;
        int start = 1;
        while (start < n) {
            count++;
            start *= 2;
        }
        if (start == n) {
            System.out.println(count);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        isPow(1024);
    }
}


