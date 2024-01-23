package Typer;

public class Typer extends Thread {
    String message;

    public Typer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
