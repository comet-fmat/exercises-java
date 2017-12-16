public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int init;
    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.init = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        //BEGIN SOLUTION
        if(this.value>0)
            this.value--;
    }

   
    public void reset(){
        this.value = 0;
    }
    
    public void setInitial(){
        this.value = this.init;
      //END SOLUTION
    }
     // and here the rest of the methods
    //implement a method reset for set value to 0
    //implement a method setInitial for return value to original ammount
}
