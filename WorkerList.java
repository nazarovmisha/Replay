import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    private List<String> list1 = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();


    void addOne() {
        synchronized (list1) {
            for (int i = 0; i < 100000; i++) {
                list1.add("One");
            }
        }
    }

    synchronized void addTwo() {
        synchronized (list2) {
            for (int i = 0; i < 100000; i++) {
                list2.add("Two");
            }
        }
    }

    class Process extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 300; i++) {
                addOne();
                addTwo();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        WorkerList wl = new WorkerList();
        Thread t1 = wl.new Process();
        Thread t2 = wl.new Process();

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long finish = System.currentTimeMillis();

        System.out.println("List 1 size is:" + wl.list1.size());
        System.out.println("List 2 size is:" + wl.list2.size());
        System.out.println("Time taken " + (finish - start) + "ms");
    }
}

