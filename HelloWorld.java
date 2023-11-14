public class HelloWorld {
    public static void main(String[] args) {
        String hello = "HelloWorld";
        while (hello.length() >= 2) {
            hello = hello.substring(1, (hello.length() - 1));
            System.out.println(hello);
        }
    }
}
