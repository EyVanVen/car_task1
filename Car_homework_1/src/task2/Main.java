package task2;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(1987);
        Car car2 = new Car(2010, "blue");

        System.out.println("Year: " + car.year + ", color: "  + car.color);
        System.out.println("Year: " + car1.year + ", color: "  + car1.color);
        System.out.println("Year: " + car2.year + ", color: " + car2.color);

    }
}