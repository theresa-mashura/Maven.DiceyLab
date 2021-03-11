import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void testConstructor() {
        // Given (Input)
        Simulation simTest = new Simulation(3, 10, 5);

        // When (Action)
        int actualNumberOfDice = simTest.getNumberOfDice();
        int actualNumberOfTosses = simTest.getNumberOfTosses();
        int actualMaxValueOnDice = simTest.getMaxValueOnDice();
        Dice actualDiceObj = simTest.getRollDice();
        Bins actualBinsObj = simTest.getBins();

        // Then (Output)
        Assert.assertEquals(3, actualNumberOfDice);
        Assert.assertEquals(10, actualNumberOfTosses);
        Assert.assertEquals(5, actualMaxValueOnDice);
        Assert.assertTrue(actualDiceObj instanceof Dice);
        Assert.assertTrue(actualBinsObj instanceof Bins);
    }

    @Test
    public void testRunSimulation() {
        // Given (Input)
        Simulation simTest = new Simulation(3, 10, 5);

        // When (Action)
        simTest.runSimulation();

        // Then (Output)
        int actualSmallestBin = simTest.getBins().getSmallestBinSize();
        int actualLargestBin = simTest.getBins().getLargestBinSize();

        int actualTossesCounted = 0;
        for (int e : simTest.getBins().getBinsArray()) {
            actualTossesCounted += e;
        }

        Assert.assertEquals(3, actualSmallestBin);
        Assert.assertEquals(15, actualLargestBin);
        Assert.assertEquals(10, actualTossesCounted);
    }

}
