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
        this.rollDice = new Dice(this.numberOfDice, this.maxValueOnDice);
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
        int totalTosses = this.numberOfDice * numberOfTosses;
        int minBin = numberOfDice;
        int maxBin = maxValueOnDice * numberOfDice;

        System.out.println("***");
        System.out.println("Simulation of " + this.numberOfDice + " tossed die(s) for " + totalTosses + " total tosses.");
        System.out.println("***");
        System.out.println();

        for (int i = minBin; i <= maxBin; i++) {
            System.out.printf("%2d : %,7d: %3.2f ", i, bins.getBinResults(i), (float) bins.getBinResults(i) / (float) totalTosses);
        }
    }


}
