
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        // initialize here the object variable amountOfNumbers
        //BEGIN SOLUTION
        this.amountOfNumbers = 0;
        this.sum = 0;
        //END SOLUTION
    }
    
    public void addNumber(int number){
        //BEGIN SOLUTION
        if(number != -1){
            this.sum = this.sum + number;
            
        }
        this.amountOfNumbers++;
        //END SOLUTION
    }
    
    public int amountOfNumbers(){
        //BEGIN SOLUTION
        return this.amountOfNumbers;
        //END SOLUTION
    }
    
    public int sum() {
        //BEGIN SOLUTION
        return this.sum;
        //END SOLUTION
    }
    
    public double average() {
        //BEGIN SOLUTION
        double sum = 0.0;
        if(this.amountOfNumbers>0){
        sum = (double)this.sum / (double)this.amountOfNumbers;
            return sum;
        } else {
            return 0;
        }
         //END SOLUTION
         //STUB: return 0;
    }
    
}
