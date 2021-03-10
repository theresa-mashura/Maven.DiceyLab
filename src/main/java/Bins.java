
public class Bins {
    private int smallestBinSize;
    private int largestBinSize;
    private int[] bins;

    public Bins(int maxValueOnDice, int numberOfDice) {
        int smallestBinSize = numberOfDice;
        int largestBinSize = maxValueOnDice * numberOfDice;
        this.bins = new int[largestBinSize - smallestBinSize + 1];
    }

    public Integer getBinResults(int bin) {
        return this.bins[bin - this.smallestBinSize];
    }

    public void incrementBin(int bin) {
        this.bins[bin - this.smallestBinSize] += 1;
    }

}
