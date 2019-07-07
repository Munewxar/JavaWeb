package model;

import model.enums.Size;

/**
 * This class describes cube.
 *
 * @author      Steven Altamirano.
 */
public class Cube extends Toy {
    private int numberOfFaces = 4;

    public Cube(double cost, Size size, int minAge) {
        super(cost, size, minAge);
    }

    public Cube(double cost, Size size, int minAge, int numberOfFaces) {
        super(cost, size, minAge);
        this.numberOfFaces = numberOfFaces;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    @Override
    public String toString() {
        return "CUBE " + getCost() + " " + getSize().toString() + " " +
                getMinAge() + " " + getNumberOfFaces();
    }
}
