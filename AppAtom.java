import java.util.concurrent.atomic.AtomicInteger;

public class AppAtom {
    private AtomicInteger count = new AtomicInteger(0);



    private void doWork() throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                count.incrementAndGet();
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                 count.incrementAndGet();
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

