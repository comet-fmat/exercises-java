import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    /*
    the constructor LotteryNumbers creates a new LotteryNumbers object,
    which contains the new drawn numbers.
    the method numbers returns the drawn numbers of this draw
    the method drawNumbers draws new numbers
    the method containsNumber reveals if the number is among the drawn numbers
    */
    private ArrayList<Integer> numbers;
    //BEGIN SOLUTION
    private Random random = new Random();
    //END SOLUTION
    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        // Write the number drawing here using the method containsNumber()
        //BEGIN SOLUTION
        this.numbers = new ArrayList<Integer>();
        int buffer;
        
        while(this.numbers.size()<7){
            buffer = this.random.nextInt(39)+1;
            
            if(!this.containsNumber(buffer)){
                this.numbers.add(buffer);
            }
        }
        //END SOLUTION
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        //BEGIN SOLUTION
        if(this.numbers.contains(number)){
            return true;
        } else {
            return false;
        }
        //END SOLUTION
    }
}
