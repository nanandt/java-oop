package progammer.amatir.application;

import progammer.amatir.data.Avanza;
import progammer.amatir.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();

    }
}
