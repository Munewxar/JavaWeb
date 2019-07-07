package model;

import model.enums.Size;

/**
 * This class describes toy.
 *
 * @author      Steven Altamirano
 */
public class Toy {
    private double cost;
    private Size size;
    private int minAge;

    public Toy(double cost, Size size, int minAge) {
        this.cost = cost;
        this.size = size;
        this.minAge = minAge;
    }

    public double getCost() {
        return cost;
    }

    public Size getSize() {
        return size;
    }

    public int getMinAge() {
        return minAge;
    }
}
