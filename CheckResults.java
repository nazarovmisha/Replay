public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                CheckResults.counter++;
            }
        });
        thread.start();
        thread.join();
        System.out.println(counter);
    }
}
