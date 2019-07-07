package model;

import model.enums.CarType;
import model.enums.Size;

/**
 * This class describes model.Car.
 *
 * @author      Steven Altamirano
 */
public class Car extends Toy {
    private CarType carType;

    public Car(double cost, Size size, int minAge, CarType carType) {
        super(cost, size, minAge);
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }
}
