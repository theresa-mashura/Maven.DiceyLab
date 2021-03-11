import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void testConstructor() {
        // Given (Input)
        int maxValueOnDice = 8;
        int numberOfDice = 2;

        // When (Action)
        Bins testBin = new Bins(8, 2);

        // Then (Output)
        Assert.assertEquals(2, testBin.getSmallestBinSize());
        Assert.assertEquals(16, testBin.getLargestBinSize());
        Assert.assertEquals(15, testBin.getBinsArray().length);
    }

    @Test
    public void testGetBinResults() {
        // Given (Input)
        Bins testBin = new Bins(6, 2);
        testBin.incrementBin(10);
        testBin.incrementBin(10);
        testBin.incrementBin(12);

        // When (Action)
        int actualBin10 = testBin.getBinResults(10);
        int actualBin12 = testBin.getBinResults(12);

        // Then (Output)
        Assert.assertEquals(2, actualBin10);
        Assert.assertEquals(1, actualBin12);
    }

    @Test
    public void incrementBin() {
        // Given (Input)
        Bins testBin = new Bins(5, 3);

        // When (Action)
        testBin.incrementBin(3);
        testBin.incrementBin(3);
        testBin.incrementBin(3);
        testBin.incrementBin(15);
        testBin.incrementBin(8);
        testBin.incrementBin(8);

        // Then (Output)
        int actualBin3 = testBin.getBinResults(3);
        int actualBin15 = testBin.getBinResults(15);
        int actualBin8 = testBin.getBinResults(8);

        Assert.assertEquals(3, actualBin3);
        Assert.assertEquals(1, actualBin15);
        Assert.assertEquals(2, actualBin8);
    }
}
