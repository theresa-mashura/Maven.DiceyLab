public class Dice {

    private int maxValueOnDice;
    private int numberOfDice;

    public Dice(int maxValueOnDice, int numberOfDice) {
        this.maxValueOnDice = maxValueOnDice;
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum() {

        int sumOfDiceResults = 0;
        int diceRolled = 0;

        while (diceRolled < this.numberOfDice) {
            sumOfDiceResults += Math.floor((Math.random() * this.maxValueOnDice + 1));
            diceRolled += 1;
        }

        return sumOfDiceResults;
    }

    public int getMaxValueOnDice() {
        return this.maxValueOnDice;
    }

    public int getNumberOfDice() {
        return this.numberOfDice;
    }

}
