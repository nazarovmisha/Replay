package Pizzeria;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Pizzeria {
    class Order {
        String pizzaName;
        long orderTime;

        public Order(String pizzaName, long orderTime) {
            this.pizzaName = pizzaName;
            this.orderTime = orderTime;
        }
    }

    BlockingQueue<Order> orders = new LinkedBlockingQueue<>();
    final long START_TIME;

    Pizzeria() {
        START_TIME = System.currentTimeMillis();
        new PizzaCar().start();
        new PizzaCar().start();

    }

    class PizzaCar extends Thread {
        public void run() {
            while (System.currentTimeMillis() - START_TIME < 5000) {
                Order order = null;
                try {
                    order = orders.poll(10, TimeUnit.MICROSECONDS);
                } catch (InterruptedException e) {
                    break;
                }
                if (order != null) {
                    if (System.currentTimeMillis() + 500 - order.orderTime <= 750) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            break;
                        }
                        System.out.println(order.pizzaName + " is delivered");
                    } else {
                        System.out.println(order.pizzaName + " is not delivered");
                    }
                }
            }
        }
    }

    void order(String pizzaName) {
        try {
            orders.put(new Order(pizzaName, System.currentTimeMillis()));
        } catch (InterruptedException e) {
            return;
        }
    }
}
