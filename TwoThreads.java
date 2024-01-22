import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class TwoThreads {
    private static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    while (true) {
                        queue.put(random.nextInt(100));
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    int rand = 0;
                    while (true) {
                        Thread.sleep(100);
                        rand = random.nextInt(10);
                        if (rand == 5) {
                            System.out.println("First thread: " + queue.take());
                            System.out.println("Second thread: " + rand);
                            System.out.println("queue: " + queue);
                            System.out.println("Queue size: " + queue.size() + "\n");
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}