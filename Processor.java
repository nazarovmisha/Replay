public class Processor extends Thread {
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Processing...");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void shutDown() {
        running = false;
    }
}

class App {
    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();
        processor.start();
        Thread.sleep(1000);
        processor.shutDown();
    }
}
