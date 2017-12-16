import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        //BEGIN SOLUTION
        this.numberOfSides = numberOfSides;
        //END SOLUTION
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        //BEGIN SOLUTION
        int roll = this.random.nextInt(numberOfSides);
        
        roll++;
        
        return roll;
        //END SOLUTION
        //STUB: return 0;
    }
}
