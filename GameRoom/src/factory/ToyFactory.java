package factory;

import factory.constants.ToyFactoryConstants;
import model.*;
import parser.Parser;

/**
 * This class is factory-class for creating different toys.
 */
public abstract class ToyFactory {
    /**
     * This method creating toys from input string.
     * @param input - input parameters
     * @return - created toy or null
     * @throws NullPointerException - if input parameters are wrong you receive null pointer
     */
    public static Toy getToy(String input) throws NullPointerException{
        String[] inputParams = input.split(" ");
        Toy toy = null;

        switch (inputParams[ToyFactoryConstants.TOY_TYPE]) {
            case ToyFactoryConstants.CAR:
                toy = new Car(Parser.parseCost(inputParams[ToyFactoryConstants.COST]),
                        Parser.parseSize(inputParams[ToyFactoryConstants.SIZE]),
                        Parser.parseMinAge(inputParams[ToyFactoryConstants.MIN_AGE]),
                        Parser.parseCarType(inputParams[ToyFactoryConstants.CAR_TYPE]));
                break;

            case ToyFactoryConstants.BALL:
                toy = new Ball(Parser.parseCost(inputParams[ToyFactoryConstants.COST]),
                        Parser.parseSize(inputParams[ToyFactoryConstants.SIZE]),
                        Parser.parseMinAge(inputParams[ToyFactoryConstants.MIN_AGE]),
                        Parser.parseBallType(inputParams[ToyFactoryConstants.BALL_TYPE]));
                break;

            case ToyFactoryConstants.CUBE:
                toy = new Cube(Parser.parseCost(inputParams[ToyFactoryConstants.COST]),
                        Parser.parseSize(inputParams[ToyFactoryConstants.SIZE]),
                        Parser.parseMinAge(inputParams[ToyFactoryConstants.MIN_AGE]),
                        Parser.parseNumberOfFaces(inputParams[ToyFactoryConstants.NUMBER_OF_FACES]));
                break;

            case ToyFactoryConstants.DOLL:
                toy = new Doll(Parser.parseCost(inputParams[ToyFactoryConstants.COST]),
                        Parser.parseSize(inputParams[ToyFactoryConstants.SIZE]),
                        Parser.parseMinAge(inputParams[ToyFactoryConstants.MIN_AGE]),
                        Parser.parseSex(inputParams[ToyFactoryConstants.SEX]));
                break;
        }

        return toy;
    }
}
