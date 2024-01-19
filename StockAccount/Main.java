package StockAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount();
        stockAccount.start();
        long profit = 0;
        Scanner in = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            command = in.next();
            switch (command) {
                case "check":
                    System.out.println(stockAccount.money);
                    break;
                case "fix":
                    profit += stockAccount.money - 1000;
                    System.out.println("Прибыль:" + profit);
                    stockAccount.money = 1000;
                    break;
            }
        }
    }
}
