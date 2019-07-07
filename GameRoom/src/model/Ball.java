package model;

import model.enums.BallType;
import model.enums.Size;

/**
 * This class describes ball.
 *
 * @author      Steven Altamirano
 */
public class Ball extends Toy{
    private BallType ballType;

    public Ball(double cost, Size size, int minAge, BallType ballType) {
        super(cost, size, minAge);
        this.ballType = ballType;
    }

    public BallType getBallType() {
        return ballType;
    }

    @Override
    public String toString() {
        return "BALL " + getCost() + " " + getSize().toString() + " " +
                getMinAge() + " " + getBallType().toString();
    }
}
