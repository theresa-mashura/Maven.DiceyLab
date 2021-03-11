public class Simulation {

    private int numberOfDice;
    private int numberOfTosses;
    private int maxValueOnDice;
    private Dice rollDice;
    private Bins bins;



    public Simulation(int numberOfDice, int numberOfTosses, int maxValueOnDice) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.maxValueOnDice = maxValueOnDice;
        this.rollDice = new Dice(this.maxValueOnDice, this.numberOfDice);
        this.bins = new Bins(this.maxValueOnDice, this.numberOfDice);
    }

    public void runSimulation() {
        int tossCount = 0;
        while (tossCount < this.numberOfTosses) {
            this.bins.incrementBin(this.rollDice.tossAndSum());
            tossCount += 1;
        }
    }


    public void printResults() {
        int minBin = this.numberOfDice;
        int maxBin = this.maxValueOnDice * this.numberOfDice;
        int n = 0;

        System.out.println("***");
        System.out.println("Simulation of " + this.numberOfDice + " tossed die(s), with " + this.maxValueOnDice + " sides each, tossed " + this.numberOfTosses + " times.");
        System.out.println("***");
        System.out.println();

        for (int i = minBin; i <= maxBin; i++) {
            System.out.printf("%2d : %,7d: %3.2f ", i, bins.getBinResults(i), (float) bins.getBinResults(i) / (float) this.numberOfTosses);

           n = (int) ((float) bins.getBinResults(i) / (float) this.numberOfTosses * 100);
           System.out.println("*".repeat(n));
        }
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public int getNumberOfTosses() {
        return numberOfTosses;
    }

    public int getMaxValueOnDice() {
        return maxValueOnDice;
    }

    public Dice getRollDice() {
        return rollDice;
    }

    public Bins getBins() {
        return bins;
    }

}
