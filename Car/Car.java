package Car;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private boolean onSale;

    public Car(String brand, String model, boolean onSale) {
     if (brand==null||model==null){
         System.out.println("Все поля должны быть заполнены");
         throw new IllegalArgumentException();

     }
        this.brand = brand;
        this.model = model;
        this.onSale = onSale;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isOnSale() {
        return onSale;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", onSale=" + onSale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
