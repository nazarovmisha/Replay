package Bank;

public class Client extends Thread {

    @Override
    public void run() {
        while (true) {
            this.takeMoney();
            this.returnMoney();
        }
    }

    static synchronized void takeMoney() {
        Bank.money.decrementAndGet();
    }

    static synchronized void returnMoney() {
        Bank.money.incrementAndGet();
    }
}
