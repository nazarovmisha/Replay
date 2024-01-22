package Bank;

public class Client extends Thread {

    @Override
    public void run() {
        while (true){
            this.takeMoney();
            this.returnMoney();
        }
    }

    void takeMoney() {
   Bank.money-=1000;
    }

    void returnMoney() {
    Bank.money+=1000;
    }
}
