public class AppAtom {
    private int count = 0;

    void increment() {
        count++;
    }

    private void doWork() throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    increment();
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        };
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count);
    }

    public static void main(String[] args) throws InterruptedException {
        AppAtom a = new AppAtom();
        a.doWork();
    }
}

