package ConsoleClock;

import java.util.Date;

public class ConsoleClock extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            Date date = new Date(System.currentTimeMillis());
            System.out.println(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("The clock was stopped");
    }
}
