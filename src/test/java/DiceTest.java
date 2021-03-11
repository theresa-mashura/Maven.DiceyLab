import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testConstructor() {
        // Given (input)
        Dice testDice = new Dice(6, 3);

        // When (Action)
        int actualMaxValue = testDice.getMaxValueOnDice();
        int actualNumberOfDice = testDice.getNumberOfDice();

        // Then (Output)
        Assert.assertEquals(6, actualMaxValue);
        Assert.assertEquals(3, actualNumberOfDice);

    }

    @Test
    public void tossAndSum() {
        // Given (Input)
        Dice testDice = new Dice(6, 2);

        // When (Action)
        int actualSum = testDice.tossAndSum();

        // Then (Output)
        Assert.assertTrue(actualSum >= 2 && actualSum <= 12);
    }
}
