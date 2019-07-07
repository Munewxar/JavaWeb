package model;

import model.enums.Sex;
import model.enums.Size;

/**
 * This class describes doll.
 *
 * @author      Steven Altamirano
 */
public class Doll extends Toy {
    private Sex sex;

    public Doll(double cost, Size size, int minAge, Sex sex) {
        super(cost, size, minAge);
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "DOLL " + getCost() + " " + getSize().toString() + " " +
                getMinAge() + " " + getSex().toString();
    }
}
