package parser;

import model.Toy;
import model.enums.*;


/**
 * This class created for parsing input data
 * from String to different types that we use
 * in out toys.
 *
 * @author      Steven Altamirano
 */
public class Parser {

    /**
     * This method helps you to parse Toy Type
     * @see ToyType
     * @param string - input string
     * @return - parse result
     */
    public static ToyType parseToyType(String string) {
        for (ToyType toyType : ToyType.values()) {
            if (toyType.toString().equalsIgnoreCase(string)) {
                return toyType;
            }
        }

        return null;
    }

    /**
     * This method helps you to parse cost (double)
     * @param string - input string
     * @return - parse result
     */
    public static double parseCost(String string) {
        return Double.valueOf(string);
    }

    /**
     * This method helps you to parse Size of toy
     * @see Size
     * @param string - input string
     * @return - parse result
     */
    public static Size parseSize(String string) {
        for (Size size : Size.values()) {
            if (size.toString().equalsIgnoreCase(string)) {
                return size;
            }
        }

        return null;
    }

    /**
     * This method helps you to parse min Age (int)
     * @param string - input string
     * @return - parse result
     */
    public static int parseMinAge(String string) {
        return Integer.valueOf(string);
    }

    /**
     * This method helps you to parse Ball Type
     * @see BallType
     * @param string - input string
     * @return - parse result
     */
    public static BallType parseBallType(String string) {
        for (BallType ballType : BallType.values()) {
            if (ballType.toString().equalsIgnoreCase(string)) {
                return ballType;
            }
        }

        return null;
    }

    /**
     * This method helps you to parse Car Type
     * @see CarType
     * @param string - input string
     * @return - parse result
     */
    public static CarType parseCarType(String string) {
        for (CarType carType : CarType.values()) {
            if (carType.toString().equalsIgnoreCase(string)) {
                return carType;
            }
        }

        return null;
    }

    /**
     * This method helps you to parse Number of Faces (int)
     * @see model.Cube
     * @param string - input string
     * @return - parse result
     */
    public static int parseNumberOfFaces(String string) {
        return Integer.valueOf(string);
    }

    /**
     * This method helps you to parse Sex
     * @see Sex
     * @param string - input string
     * @return - parse result
     */
    public static Sex parseSex(String string) {
        for (Sex sex : Sex.values()) {
            if (sex.toString().equalsIgnoreCase(string)) {
                return sex;
            }
        }

        return null;
    }

}
