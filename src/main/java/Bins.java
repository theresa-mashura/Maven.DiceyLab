
public class Bins {
    private int smallestBinSize;
    private int largestBinSize;
    private int[] binsArray;


    public Bins(int maxValueOnDice, int numberOfDice) {
        this.smallestBinSize = numberOfDice;
        this.largestBinSize = maxValueOnDice * numberOfDice;
        this.binsArray = new int[largestBinSize - smallestBinSize + 1];
    }

    public Integer getBinResults(int bin) {
        return this.binsArray[bin - this.smallestBinSize];
    }

    public void incrementBin(int bin) {
        this.binsArray[bin - this.smallestBinSize] += 1;
    }

    public int getSmallestBinSize() {
        return this.smallestBinSize;
    }

    public int getLargestBinSize() {
        return this.largestBinSize;
    }

    public int[] getBinsArray() {
        return binsArray;
    }
}
