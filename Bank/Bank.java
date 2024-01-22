package Bank;

public class Bank {
  static   int money = 10000;

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

    int getMoney() {
        return money;
    }
}

