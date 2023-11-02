public class IsPow {
    public static void isPow(int n) {
        int count = 0;
        while (n > 2) {
            count++;
            n=n/n;
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        isPow(64);
    }
}


