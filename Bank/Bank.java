package Bank;

import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
  static AtomicInteger money = new AtomicInteger(10000);

    public Bank() {
        new Client().start();
        new Client().start();
        new Client().start();
    }


    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        while (true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }

    AtomicInteger getMoney() {
        return money;
    }
}

