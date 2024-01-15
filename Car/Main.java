package Car;

import java.util.*;

public class Main {
    private static final String toyota = "Toyota";
    private static final String kia = "Kia";
    private static final String bmw = "BMW";

    public static void main(String[] args) {
        Car car1 = new Car(toyota, "Corolla", false);
        Car car2 = new Car(toyota, "Camry", false);
        Car car3 = new Car(kia, "Rio", false);
        Car car4 = new Car(bmw, "320", true);
        Car car5 = new Car(toyota, "Corolla", false);
        Car car6 = new Car(toyota, "Camry", false);
        Car car7 = new Car(kia, "Rio", false);
        Car car8 = new Car(bmw, "320", true);
        Car car9 = new Car(toyota, "Corolla", false);
        Car car10 = new Car(toyota, "Camry", false);
        Car car11 = new Car(kia, "Rio", false);
        Car car12 = new Car(bmw, "320", true);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);

        for (Car car : carList) {
            System.out.println(car);
        }
        Set<Car> carList1 = new HashSet(carList);
        System.out.println();
        for (Car car : carList1) {
            System.out.println(car);
        }
    }
}
