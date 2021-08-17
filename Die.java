import java.util.Random;

/** The Die class simulates a 6-sided die.
*/

public class Die
{
    private final int MIN_SIDES = 4;
    private int sides; // number of sides
    private int value; // the die's value

    /**
    The constructor performs an initial roll 
    of the die
    @param numSides The number of sides for this die
    */

    public Die(int numSides)
    {
        // validate the number of sides
        if (numSides < MIN_SIDES) {
            throw new IllegalArgumentException(
                "The die must have at least " +
                MIN_SIDES + " sides.");

        }

        // Store the number of sides and roll
        sides = numSides;
        roll();
    }

    /**
    The roll method simulates the rolling of 
    the die
    */

    public void roll()
    {
        // Create a Random ojbect
        Random rand = new Random();

        // Get a random value for the die
        value = rand.nextInt(sides) + 1;

    }

    /** 
    getSides method
    @return the number of sides for this die
    */

    public int getSides(){
        return sides;
    }

    /**
    getValue method
    @return the value of the die
    */

    public int getValue() {
        return value;

    }
}
