package Pizzeria;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.order("Margarita");
        Thread.sleep(1000);
        pizzeria.order("Pepperoni");
        Thread.sleep(1000);
        pizzeria.order("Sicilian");
        Thread.sleep(1000);
        pizzeria.order("Greek");

    }
}


